package com.sfy.decorator;

/**
 * @Description: DecoratorClassTest.java
 * @Date: 2016/04/18
 * @Author: sunfayun
 * @Version: 1.0
 */
public class DecoratorClassTest {

    public static void main(String[] args) {
        DecoratorClass decoratorClass = new DecoratorClass(new SourceClass());
        decoratorClass.decoratorMethod();
    }

}
