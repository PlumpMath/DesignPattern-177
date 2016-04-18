package com.sfy.adapter.classadapter;

/**
 * 描述： 类的适配器
 * 适配器模式将某个类的接口转换成客户端期望的另一个接口表示，
 * 目的是消除由于接口不匹配所造成的类的兼容性问题。主要分为三类：类的适配器模式、对象的适配器模式、接口的适配器模式。
 * @Description: ClassAdapter.java
 * @Date: 2016/04/18
 * @Author: sunfayun
 * @Version: 1.0
 */
public class ClassAdapter extends SourceClass implements TargetInterface {

    @Override
    public void targetMethod() {
        System.err.println("target method");
    }

}
