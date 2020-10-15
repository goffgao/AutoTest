package cn.wt.cases;

import cn.wt.DecypteH5;
import cn.wt.model.HallNameCase;
import cn.wt.utils.DatabaseUtil;
import cn.wt.config.TestConfig;
import cn.wt.model.InterfaceName;
import cn.wt.utils.ConfigFile;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.apache.ibatis.session.SqlSession;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

public class HallNameTest {

    @BeforeTest(groups = "loginTrue",description = "测试准备工作,获取HttpClient对象")
    public void beforeTest(){
        TestConfig.defaultHttpClient = new DefaultHttpClient();
        TestConfig.hallName = ConfigFile.getUrl(InterfaceName.HALLNAME);

    }

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());

    }
    private String getResult(HallNameCase hallNameCase) throws Exception {
        //设置接口请求链接
        HttpPost post = new HttpPost(TestConfig.hallName);
        //设置请求头信息 设置header
        post.setHeader("content-type","application/json");
        //设置请求信息和加密
        com.alibaba.fastjson.JSONObject data = new com.alibaba.fastjson.JSONObject();
        data.put("developPersonId",hallNameCase.getDevelopPersonId());
        System.out.println(data.toString());
        com.alibaba.fastjson.JSONObject pdata = new JSONObject();
        pdata.put("sdt",data.toJSONString());
        pdata.put("sdt",DecypteH5.H5_sdt_en(pdata.toJSONString()));
        pdata.put("channel","h5");
        //毫秒时间
        pdata.put("time",System.currentTimeMillis());
        pdata.put("version","1.0.0");
        System.out.println(pdata.toString());
        //将参数信息添加到方法中
        StringEntity entity = new StringEntity(pdata.toString(),"utf-8");
        post.setEntity(entity);
        //声明一个对象来进行响应结果的存储
        String result;
        //执行post方法
        HttpResponse response = cn.wt.config.TestConfig.defaultHttpClient.execute(post);
        //获取响应结果
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println("打印出结果"+result);
        //获取cookies为了保持持续通讯
        cn.wt.config.TestConfig.store =  cn.wt.config.TestConfig.defaultHttpClient.getCookieStore();
        return result;
    }

    //定义一个方法


    @Test
    public void HallNameTest() throws Exception { // session调用配置文件中 链接数据库,查询语句获取结果
        SqlSession session = DatabaseUtil.getSqlSession();
        HallNameCase hallNameCase = session.selectOne("hallNameCase",1);
        System.out.println(hallNameCase.toString());
        String response = DecypteH5.H5_srs_de(getResult(hallNameCase));
        System.out.println(response);
        JSONObject test = (JSONObject) JSONObject.parse(response);
        String result = test.getJSONObject("srs").getString("hallName");
        System.out.println(result);

        Assert.assertEquals(hallNameCase.getExpected(),result);


    }
    // httpsClient中的 需要变量
    // TestConfig设置变量名称  =   ConfigFile设置URL拼接和变量(然后InterfaceName是设置固定得传参和拼接判断)
    // 然后InterfaceName = ConfigFile 方便调用变量URL和请求参数 指定读取 application中的URL
    /*
      TestConfig.defaultHttpClient = new DefaultHttpClient();
        TestConfig.getUserInfoUrl = ConfigFile.getUrl(InterfaceName.GETUSERINFO);
        TestConfig.getUserListUrl = ConfigFile.getUrl(InterfaceName.GETUSERLIST);
        TestConfig.loginUrl = ConfigFile.getUrl(InterfaceName.LOGIN);
        TestConfig.updateUserInfoUrl = ConfigFile.getUrl(InterfaceName.UPDATEUSERINFO);
        TestConfig.addUserUrl = ConfigFile.getUrl(InterfaceName.ADDUSERINFO);

           private static ResourceBundle bundle= ResourceBundle.getBundle("application", Locale.CHINA);;

    public static String getUrl(InterfaceName name){
            String address = bundle.getString("test.url");
            String uri = "";
            String testUrl;
            if(name == InterfaceName.GETUSERLIST){
                uri = bundle.getString("getUserList.uri");

            }
     */

}
