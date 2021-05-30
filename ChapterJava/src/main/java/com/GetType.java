package com;

public class GetType {


    public static String getType(Object test) {
        return test.getClass().getName().toString();

    }
}
