package com.sfy.singleton;

/**
 * @Description: Singleton.java
 * @Date: 2016/04/18
 * @Author: sunfayun
 * @Version: 1.0
 */
public class Singleton {

    private static final Singleton SINGLETON = new Singleton();

    private Singleton(){};

    public Singleton getInstance(){
        return SINGLETON;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve(){
        return getInstance();
    }

}
