package com.sfy.builder.demo;

/**
 * 汉堡
 * @Description: Burger.java
 * @Date: 2016/05/12
 * @Author: sunfayun
 * @Version: 1.0
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
