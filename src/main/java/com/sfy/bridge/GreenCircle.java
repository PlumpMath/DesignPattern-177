package com.sfy.bridge;

/**
 * @Description: GreenCircle.java
 * @Date: 2016/05/13
 * @Author: sunfayun
 * @Version: 1.0
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle color:green,radius:"+radius+",X:"+x+",Y:"+y);
    }
}
