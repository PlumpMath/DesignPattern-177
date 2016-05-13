package com.sfy.builder.demo;

/**
 * 百事可乐
 * @Description: Pepsi.java
 * @Date: 2016/05/12
 * @Author: sunfayun
 * @Version: 1.0
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
