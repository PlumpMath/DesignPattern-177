package com.sfy.builder.demo;

/**
 * 冷饮
 * @Description: ColdDrink.java
 * @Date: 2016/05/12
 * @Author: sunfayun
 * @Version: 1.0
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
