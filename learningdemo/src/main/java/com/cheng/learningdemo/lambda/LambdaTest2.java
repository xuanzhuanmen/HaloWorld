package com.cheng.learningdemo.lambda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * from：https://my.oschina.net/benhaile/blog/175012
 */
public class LambdaTest2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        JButton button1 = new JButton("点我！");
        JButton button2 = new JButton("再点我！");

        frame.getContentPane().add(button1);
        frame.getContentPane().add(button2);
        //这里addActionListener方法的参数是ActionListener，是一个函数式接口
        //使用lambda表达式方式
        //函数式接口的简化写法。
        button1.addActionListener(e -> {
            System.out.println("这里是Lambda实现方式。");
        });
        //使用方法引用方式
        button2.addActionListener(LambdaTest2::doSomething);

    }

    public static void doSomething(ActionEvent e) {
        System.out.println("这里是方法引用实现方式。");
    }
}
