package com.sfy.decorator;

/**
 * @Description: SourceClass.java
 * @Date: 2016/04/18
 * @Author: sunfayun
 * @Version: 1.0
 */
public class SourceClass implements DecoratorInterface {

    @Override
    public void decoratorMethod() {
        System.err.println("decorator source method");
    }

}
