package cn.wt.cases;

import cn.wt.DecypteH5;
import cn.wt.config.POP3ReceiveMailTest;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class LoginPost {

    private String url;
    private ResourceBundle bundle;
    //用来存储cookies信息的变量
    private CookieStore store;
    @BeforeTest
    public void beforeTest(){
        bundle = ResourceBundle.getBundle("application", Locale.CHINA);
        url = bundle.getString("wt.url");
    }

    @Test(groups = {"Login"})
    public void testPostSMS() throws Exception {
        String uri = bundle.getString("sms.uri");
        //拼接最终的测试地址
        String testUrl = this.url + uri;
        //声明一个Client对象，用来进行方法的执行
        DefaultHttpClient client = new DefaultHttpClient();
        //声明一个方法，这个方法就是post方法
        HttpPost post = new HttpPost(testUrl);
        //添加参数
        JSONObject param = new JSONObject();
        param.put("sdt","1U6+KvoJ4TYF01bsEvwWRv7Xc36bjgYyaMH1q4j81qA=");
        param.put("channel","h5");
        //设置请求头信息 设置header
        post.setHeader("content-type","application/json");
        //将参数信息添加到方法中
        StringEntity entity = new StringEntity(param.toString(),"utf-8");
        post.setEntity(entity);
        //声明一个对象来进行响应结果的存储
        String result;
        //设置cookies信息
        client.setCookieStore(this.store);
        //执行post方法
        HttpResponse response = client.execute(post);
        //获取响应结果
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);
    }


    @Test(groups = {"Login"})
    public void testLoginCookies() throws Exception {
        TimeUnit.SECONDS.sleep(5);
        String uri = bundle.getString("loginH5.uri");
        //拼接最终的测试地址
        String testUrl = this.url + uri;

        //声明一个Client对象，用来进行方法的执行
        DefaultHttpClient client = new DefaultHttpClient();

        //声明一个方法，这个方法就是post方法
        HttpPost post = new HttpPost(testUrl);
        String smsCode = POP3ReceiveMailTest.receive();
        //添加参数
        JSONObject param = new JSONObject();
        JSONObject data = new JSONObject();

        data.put("mobile","17602044708");
        data.put("code",smsCode);
//        data.put("developPerson","55555557x");
        param.put("data",data);
        param.put("channel","h5");
        System.out.println("============"+param);

        //设置请求头信息 设置header
        post.setHeader("content-type","application/json");
        //将参数信息添加到方法中
        StringEntity entity = new StringEntity(param.toString(),"utf-8");
        post.setEntity(entity);
        //声明一个对象来进行响应结果的存储
        String result;
        //设置cookies信息
        client.setCookieStore(this.store);
        //执行post方法
        HttpResponse response = client.execute(post);
        //获取响应结果
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);

        //获取cookies信息
        this.store = client.getCookieStore();
        List<Cookie> cookieList = store.getCookies();

        for (Cookie cookie : cookieList){
            String name = cookie.getName();
            String value = cookie.getValue();
            System.out.println("cookie name = " + name
                    + ";  cookie value = " + value);
        }

    }

    @Test (dependsOnGroups={"Login"})
    public void testUserVipInfo() throws Exception {
        String uri = bundle.getString("userVipInfo.uri");
        //拼接最终的测试地址
        String testUrl = this.url + uri;

        //声明一个Client对象，用来进行方法的执行
        DefaultHttpClient client = new DefaultHttpClient();

        //声明一个方法，这个方法就是post方法
        HttpPost post = new HttpPost(testUrl);

        //添加参数
        JSONObject param = new JSONObject();
        param.put("sdt","gJ1vo1bLBe6NYJK4bGeDp4Nxx2go4F/LfpFAjZ1ikKtzuEZmHK0s4QzM0VhLG8eD");
        param.put("channel","h5");

        //设置请求头信息 设置header
        post.setHeader("content-type","application/json");
        //将参数信息添加到方法中
        StringEntity entity = new StringEntity(param.toString(),"utf-8");
        post.setEntity(entity);
        //声明一个对象来进行响应结果的存储
        String result;
        //设置cookies信息
        client.setCookieStore(this.store);
        //执行post方法
        HttpResponse response = client.execute(post);
        //获取响应结果
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(DecypteH5.H5_srs_de(result));


        //处理结果，就是判断返回结果是否符合预期
        //将返回的响应结果字符串转化成为json对象
//        JSONObject resultJson = new JSONObject(result);


//        //获取到结果值
//        String success = (String) resultJson.get("huhansan");
//        String status = (String) resultJson.get("status");
//        //具体的判断返回结果的值
//        Assert.assertEquals("success",success);
//        Assert.assertEquals("1",status);

    }


}
