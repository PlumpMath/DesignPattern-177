package com.sfy.builder.demo;

/**
 * 鸡肉汉堡
 * @Description: ChickenBurger.java
 * @Date: 2016/05/12
 * @Author: sunfayun
 * @Version: 1.0
 */
public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.0f;
    }

}
