package com.sfy.bridge;

/**
 * @Description: Shape.java
 * @Date: 2016/05/13
 * @Author: sunfayun
 * @Version: 1.0
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();

}
