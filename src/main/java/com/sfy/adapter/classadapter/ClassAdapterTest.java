package com.sfy.adapter.classadapter;

/**
 * @Description: ClassAdapterTest.java
 * @Date: 2016/04/18
 * @Author: sunfayun
 * @Version: 1.0
 */
public class ClassAdapterTest {

    public static void main(String[] args) {
        TargetInterface targetInterface = new ClassAdapter();
        targetInterface.sourceMethod();
        targetInterface.targetMethod();
    }

}
