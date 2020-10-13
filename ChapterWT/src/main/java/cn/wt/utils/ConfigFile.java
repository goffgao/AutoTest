package cn.wt.utils;

import cn.wt.model.InterfaceName;

import java.util.Locale;
import java.util.ResourceBundle;

public class ConfigFile {

   private static ResourceBundle bundle= ResourceBundle.getBundle("application", Locale.CHINA);;

    public static String getUrl(InterfaceName name){
        String address = bundle.getString("wt.url");
        String uri = "";
        String testUrl;
        if(name == InterfaceName.HALLNAME){
            uri = bundle.getString("hallName.uri");

        }

//        if(name == InterfaceName.ADDUSERINFO){
//            uri = bundle.getString("addUser.uri");
//        }
        testUrl = address + uri;
        return testUrl;
    }
}
