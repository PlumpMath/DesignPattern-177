package com.sfy.builder.demo;

/**
 * 瓶子
 * @Description: Bottle.java
 * @Date: 2016/05/12
 * @Author: sunfayun
 * @Version: 1.0
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }

}
