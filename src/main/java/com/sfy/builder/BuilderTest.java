package com.sfy.builder;

/**
 * @Description: BuilderTest.java
 * @Date: 2016/04/18
 * @Author: sunfayun
 * @Version: 1.0
 */
public class BuilderTest {

    public static void main(String[] args) {
        Builder builder = new Builder();
        //发送邮件
        builder.senderBuilder("mail");
        //发送短信
        builder.senderBuilder("sms");
    }

}
