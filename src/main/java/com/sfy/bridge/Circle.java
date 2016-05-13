package com.sfy.bridge;

/**
 * @Description: Circle.java
 * @Date: 2016/05/13
 * @Author: sunfayun
 * @Version: 1.0
 */
public class Circle extends Shape {

    private int radius,x,y;

    public Circle(DrawAPI drawAPI,int radius,int x,int y){
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }

}
