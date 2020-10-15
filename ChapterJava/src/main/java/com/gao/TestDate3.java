package com.gao;

import java.util.Calendar;
import java.util.Date;

public class TestDate3 {

    public static void main(String[] args) {
        // 方法一
        System.out.println(System.currentTimeMillis());

        // 方法二
        Date date = new Date();
        System.out.println(date.getTime());

        // 方法三
        Calendar calendar = Calendar.getInstance();
        long time = calendar.getTimeInMillis();
        System.out.println(time);
    }
}
