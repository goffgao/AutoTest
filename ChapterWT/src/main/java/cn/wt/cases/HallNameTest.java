package cn.wt.cases;

import cn.wt.model.HallNameCase;
import cn.wt.utils.DatabaseUtil;
import cn.wt.config.TestConfig;
import cn.wt.model.InterfaceName;
import cn.wt.utils.ConfigFile;
import com.tester.model.LoginCase;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.apache.ibatis.session.SqlSession;
import org.json.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class HallNameTest {

    @BeforeTest(groups = "loginTrue",description = "测试准备工作,获取HttpClient对象")
    public void beforeTest(){
        TestConfig.defaultHttpClient = new DefaultHttpClient();
        TestConfig.hallName = ConfigFile.getUrl(InterfaceName.HALLNAME);

    }



    @Test
    public void loginTrue() throws IOException { // session调用配置文件中 链接数据库,查询语句获取结果
        SqlSession session = DatabaseUtil.getSqlSession();
        HallNameCase developHallNameCase = session.selectOne("developHallNameCase",1);
        System.out.println(developHallNameCase.toString());
//

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
