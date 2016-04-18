package com.sfy.factory.abstractfactory;

/**
 * @Description: AbstractFactoryTest.java
 * @Date: 2016/04/18
 * @Author: sunfayun
 * @Version: 1.0
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        //发送邮件
        Provider mailProvider = new MailSenderFactory();
        mailProvider.producer().send();

        //发送短信
        Provider smsProvider = new SmsSenderFactory();
        smsProvider.producer().send();
    }

}
