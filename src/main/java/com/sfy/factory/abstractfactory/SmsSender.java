package com.sfy.factory.abstractfactory;

/**
 * @Description: SmsSender.java
 * @Date: 2016/04/18
 * @Author: sunfayun
 * @Version: 1.0
 */
public class SmsSender implements Sender {

    @Override
    public void send() {
        System.err.println("SmsSender方法被执行");
    }

}
