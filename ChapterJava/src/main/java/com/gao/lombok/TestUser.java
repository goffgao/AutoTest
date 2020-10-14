package com.gao.lombok;


import java.util.Date;

public class TestUser {
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
