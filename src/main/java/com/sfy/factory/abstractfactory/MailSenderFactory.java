package com.sfy.factory.abstractfactory;

/**
 * @Description: MailSenderFactory.java
 * @Date: 2016/04/18
 * @Author: sunfayun
 * @Version: 1.0
 */
public class MailSenderFactory implements Provider {

    @Override
    public Sender producer() {
        return new MailSender();
    }

}
