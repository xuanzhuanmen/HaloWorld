package com.cheng.learningdemo.lambda;

/**
 * from：https://my.oschina.net/benhaile/blog/175012
 */
public class LambdaTest1 {
    // lambda创建一个线程——相比于内部类的写法，更简洁。
    public static void runThreadUseLambda() {
        // Runnable是一个函数接口，只包含了有个无参数的，返回void的run方法；
        // 所以lambda表达式左边没有参数，右边也没有return，只是单纯的打印一句话
        new Thread(() -> System.out.println("lambda实现的线程。")).start();
    }

    // 内部类创建一个线程
    public static void runThreadUseInnerClass() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("内部类实现的线程。");
            }
        }).start();
    }

    public static void main(String[] args) {
        LambdaTest1.runThreadUseLambda();
        LambdaTest1.runThreadUseInnerClass();
    }
}
