package com.sfy.builder.demo;

/**
 * 素食汉堡
 * @Description: VegBurger.java
 * @Date: 2016/05/12
 * @Author: sunfayun
 * @Version: 1.0
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }

}
