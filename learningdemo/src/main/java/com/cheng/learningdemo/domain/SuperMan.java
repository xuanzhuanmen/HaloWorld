package com.cheng.learningdemo.domain;

import java.io.Serializable;

public class SuperMan extends Person implements Serializable {

    //是否蓝色三角裤
    private boolean blueBriefs;

    public boolean isBlueBriefs() {
        return blueBriefs;
    }

    public void setBlueBriefs(boolean blueBriefs) {
        this.blueBriefs = blueBriefs;
    }

    public void fly() {
        System.out.println("超人飞呀飞~~~~~~");
    }

    public void walk(int m) {
        System.out.println("超人会走耶～～走了" + m + "米就走不动了！");
    }
}
