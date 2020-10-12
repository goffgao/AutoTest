package com.gao.lombok;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class TestUser {
//    private Logger log = LoggerFactory.getLogger(this.getClass());
    public static void main(String[] args) {
        User user = new User();

        /*
        下面是没有使用lombok @Data时候写的方法
        user.setId("21");
        user.setName("xi");
        user.setAge("23");
        user.setBir(new Date());
         */
        user.setId("21").setName("gao").setAge(32).setBir(new Date());
        System.out.println(user);

    }

}
