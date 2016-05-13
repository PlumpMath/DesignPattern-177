package com.sfy.singleton;

/**
 * 描述： 使用懒加载的方式实现单例模式，一般类比较重，优化加载速度可以用懒加载的方式实现
 * @Description: SingletonLazy.java
 * @Date: 2016/04/18
 * @Author: sunfayun
 * @Version: 1.0
 */
public class SingletonLazy {

    private static SingletonLazy singletonLazy = null;

    private SingletonLazy(){};

    private static synchronized void initInstance(){
        if(singletonLazy == null){
            singletonLazy = new SingletonLazy();
        }
    }

    public static SingletonLazy getInstance(){
        if(singletonLazy == null){
            initInstance();
        }
        return singletonLazy;
    }


    //双重校验锁的方式实现
    public static SingletonLazy getInstanceOther(){
        if(singletonLazy == null){
            synchronized (SingletonLazy.class){
                if(singletonLazy == null){
                    singletonLazy = new SingletonLazy();
                }
            }
        }
        return singletonLazy;
    }

}
