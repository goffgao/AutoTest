package com.gui;

import javax.swing.*;
import java.awt.*;

public class TestFrame {
    public static void main(String[] args) {
        //Frame  ,看源码
        Frame frame = new Frame("我打的第一个Java窗口");

        //设置可见
        frame.setVisible(true);

        //设置窗口大小
        frame.setSize(400, 300);

        //设置背景颜色 Color
        frame.setBackground(new Color(85, 30, 68));

        //弹出的初始位置
        frame.setLocation(200,200);

        //设置大小固定 不能拉伸窗口
        frame.setResizable(false);


    }
}