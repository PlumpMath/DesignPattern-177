package com.sfy.builder.demo;

/**
 * 可口可乐
 * @Description: Coke.java
 * @Date: 2016/05/12
 * @Author: sunfayun
 * @Version: 1.0
 */
public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
