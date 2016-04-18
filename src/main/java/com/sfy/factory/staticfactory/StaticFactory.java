package com.sfy.factory.staticfactory;

/**
 * @Description: StaticFactory.java
 * @Date: 2016/04/18
 * @Author: sunfayun
 * @Version: 1.0
 */
public class StaticFactory {

    public static Sender mailSenderProducer(){
        return new MailSender();
    }

    public static Sender smsSenderProducer(){
        return new SmsSender();
    }

}
