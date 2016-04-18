package com.sfy.adapter.objectadapter;

/**
 * @Description: ObjectAdapterTest.java
 * @Date: 2016/04/18
 * @Author: sunfayun
 * @Version: 1.0
 */
public class ObjectAdapterTest {

    public static void main(String[] args) {
        ObjectAdapter objectAdapter = new ObjectAdapter(new SourceClass());
        objectAdapter.sourceMethod();
        objectAdapter.targetMethod();
    }

}
