package cn.wt;

import cn.wt.config.POP3ReceiveMailTest;
import com.alibaba.fastjson.JSONObject;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.Charset;
import java.util.Base64;
import java.util.Scanner;

/**
 * @Author xulei
 * @Description
 * @Date 2019/12/27
 **/
public class DecypteH5 {

    public static void mainx(String[] args) throws Exception {
        String smsCode = POP3ReceiveMailTest.receive();
        System.out.println(smsCode);

    }



    //两个地方的解密只能二选一
    //【手厅 两套加解密  】 前 sdt请求：NH7#m8UN  后 srs 响应：PAu4v@6m
    private static final String ST_sdt_KEY = "NH7#m8UN";
    private static final String ST_srs_KEY = "PAu4v@6m";


    //【管理后台 两套加解密  】前 sdt请求： d9a@!iam  后 srs 响应： coapw*&i
    private static final String MANAGER_sdt_KEY = "d9a@!iam";
    private static final String MANAGER_srs_KEY = "coapw*&i";


    //【H5 两套加解密 】前 sdt请求:'w@sd8dlm'; 后 srs 响应 解密 “#ems&koq”
    private static final String H5_sdt_KEY = "w@sd8dlm";
    private static final String H5_srs_KEY = "#ems&koq";


    /**
     * 加密请求的默认key
     */
    static String REQUEST_KEY = "w@sd8dlm";
    /**
     * 偏移量
     */
    private static byte[] iv = { 1, 2, 3, 4, 5, 6, 7, 8 };


    // 只能有一个main函数所以用1干扰
    public static void main1(String[] args) throws Exception{



        JSONObject data = new JSONObject();

        data.put("developPerson","88888888");
        data.put("skuId","596901070520191205160993");
        data.put("spuId","20200402160023301765390");
        data.put("effectType","COMM");

        JSONObject pdata = new JSONObject();
        pdata.put("channel","h5");
        pdata.put("time","1589774730695");
        pdata.put("version","1.0.0");
        pdata.put("sdt",encrypt(data.toJSONString(), REQUEST_KEY));
        System.out.println("加密后的数据:\n"+pdata.toJSONString());
        //解密
//        pdata.put("data",DesDecrypt(pdata.getString("sdt"),REQUEST_KEY));
//        pdata.put("sdt","");
        System.out.println("解密的数据:\n\n" +pdata.toJSONString());
    }

    // 请求
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入解密json数据:\n");
        JSONObject jsonParser = JSONObject.parseObject(scanner.next());
        String str = DesDecrypt(jsonParser.getString("sdt"),H5_sdt_KEY);
//        String str = DesDecrypt(jsonParser.getString("sdt"),MANAGER_sdt_KEY);
        jsonParser.put("sdt",str);
        System.out.println("请求解密的数据:\n\n" +jsonParser.toJSONString());


    }
    // 响应
    public static void main33(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);//你给的数据
        System.out.println("输入解密密json数据:\n");
        JSONObject jsonParser = JSONObject.parseObject(scanner.next());
        String str = DesDecrypt(jsonParser.getString("srs"),H5_srs_KEY);
//        String str = DesDecrypt(jsonParser.getString("srs"),MANAGER_srs_KEY);
        jsonParser.put("srs",str);
        System.out.println("响应解密的数据:\n\n" +jsonParser.toJSONString());
    }


    // ST_前端解密
    public static String ST_sdt_de(String str) throws Exception{
        JSONObject jsonParser = JSONObject.parseObject(str);
        String str1 = DesDecrypt(jsonParser.getString("sdt"),ST_sdt_KEY);
        return str1;
    }
    // Manage_前端解密
    public static String MANAGER_sdt_de(String str) throws Exception{
        JSONObject jsonParser = JSONObject.parseObject(str);
        String str2 = DesDecrypt(jsonParser.getString("sdt"),MANAGER_sdt_KEY);
        return str2;
    }
    // H5_前端解密
    public static String H5_sdt_de(String str) throws Exception{
        JSONObject jsonParser = JSONObject.parseObject(str);
        String str3 = DesDecrypt(jsonParser.getString("sdt"),H5_sdt_KEY);
        return str3;
    }




    // ST_后端解密
    public static String ST_srs_de(String str) throws Exception{
        JSONObject jsonParser = JSONObject.parseObject(str);
        String str1 = DesDecrypt(jsonParser.getString("srs"),ST_srs_KEY);
        return str1;
    }
    // Manage_后端解密
    public static String MANAGER_srs_de(String str) throws Exception{
        JSONObject jsonParser = JSONObject.parseObject(str);
        String str2 = DesDecrypt(jsonParser.getString("srs"),MANAGER_srs_KEY);
        return str2;
    }
    // H5_后端解密
    public static String H5_srs_de(String str) throws Exception{
        JSONObject jsonParser = JSONObject.parseObject(str);
        String str3 = DesDecrypt(jsonParser.getString("srs"),H5_srs_KEY);
        jsonParser.put("srs",str3);
        return jsonParser.toString();


    }


    // ST_前端加密
    public static String ST_sdt_en(String str) throws Exception{


        JSONObject jsonParser = JSONObject.parseObject(str);


        String str1 = encrypt(jsonParser.getString("sdt"),ST_sdt_KEY);


        return str1;
    }
    // MANAGER_前端加密
    public static String MANAGER_sdt_en(String str) throws Exception{


        JSONObject jsonParser = JSONObject.parseObject(str);


        String str2 = encrypt(jsonParser.getString("sdt"),MANAGER_sdt_KEY);


        return str2;
    }
    // H5_前端加密
    public static String H5_sdt_en(String str) throws Exception{


        JSONObject jsonParser = JSONObject.parseObject(str);


        String str3 = encrypt(jsonParser.getString("sdt"),H5_sdt_KEY);


        return str3;
    }


    // ST_后端加密
    public static String ST_srs_en(String str) throws Exception{


        JSONObject jsonParser = JSONObject.parseObject(str);


        String str1 = encrypt(jsonParser.getString("srs"),ST_srs_KEY);


        return str1;
    }
    // MANAGER_后端加密
    public static String MANAGER_srs_en(String str) throws Exception{


        JSONObject jsonParser = JSONObject.parseObject(str);


        String str2 = encrypt(jsonParser.getString("srs"),MANAGER_srs_KEY);


        return str2;
    }
    // H5_后端加密
    public static String H5_srs_en(String str) throws Exception{


        JSONObject jsonParser = JSONObject.parseObject(str);


        String str3 = encrypt(jsonParser.getString("srs"),H5_srs_KEY);


        return str3;
    }






    /**
     * DES 解密
     * @param context
     * @param key
     * @return
     */
    public static synchronized String DesDecrypt(String context, String key) throws Exception{
        if(key == null || key.length() != 8){
            throw new Exception("加密的Key不等于8位");
        }
        return decrypt(context,key);
    }




    /**
     * 加密
     *
     * @param encryptText 需要加密的信息
     * @param key 加密密钥
     * @return 加密后Base64编码的字符串
     */
    public static String encrypt(String encryptText, String key) {


        if (encryptText == null || key == null) {
            throw new IllegalArgumentException("encryptText or key must not be null");
        }


        try {
            IvParameterSpec zeroIv = new IvParameterSpec(iv);
            SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), "DES");
            Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, keySpec, zeroIv);
            byte[] bytes = cipher.doFinal(encryptText.getBytes(Charset.forName("UTF-8")));
            return Base64.getEncoder().encodeToString(bytes);


        } catch (Exception e) {
            throw new RuntimeException("encrypt failed", e);
        }


    }


    /**
     * 解密
     *
     * @param decryptText 需要解密的信息
     * @param key 解密密钥，经过Base64编码
     * @return 解密后的字符串
     */
    public static  String decrypt(String decryptText, String key) {


        if (decryptText == null || key == null) {
            throw new IllegalArgumentException("decryptText or key must not be null");
        }
        try {
            IvParameterSpec zeroIv = new IvParameterSpec(iv);
            SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), "DES");
            Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, keySpec, zeroIv);
            byte[] bytes = cipher.doFinal(Base64.getDecoder().decode(decryptText));
            return new String(bytes, Charset.forName("UTF-8"));


        } catch (Exception e) {
            throw new RuntimeException("decrypt failed", e);
        }
    }
}