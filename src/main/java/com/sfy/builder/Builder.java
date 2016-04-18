package com.sfy.builder;

/**
 * 描述： 建造者模式
 * 工厂模式关注的是创建单个产品，而建造者模式则关注创建符合的对象
 * @Description: Builder.java
 * @Date: 2016/04/18
 * @Author: sunfayun
 * @Version: 1.0
 */
public class Builder {

    public void mailSenderProducer(){
        MailSender mailSender = new MailSender();
        mailSender.send();
    }

    public void smsSenderProducer(){
        SmsSender smsSender = new SmsSender();
        smsSender.send();
    }

    public void senderBuilder(String type){
        switch (type){
            case "mail":
                this.mailSenderProducer();
                break;
            case "sms":
                this.smsSenderProducer();
                break;
            default:
                System.err.println("输入参数错误");
                break;
        }
    }

}
