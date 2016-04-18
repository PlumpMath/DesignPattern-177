package com.sfy.factory.staticfactory;

/**
 * @Description: StaticFactoryTest.java
 * @Date: 2016/04/18
 * @Author: sunfayun
 * @Version: 1.0
 */
public class StaticFactoryTest {

    public static void main(String[] args) {
        //发送邮件
        Sender mailSender = StaticFactory.mailSenderProducer();
        mailSender.send();

        //发送短信
        Sender smsSender = StaticFactory.smsSenderProducer();
        smsSender.send();
    }

}
