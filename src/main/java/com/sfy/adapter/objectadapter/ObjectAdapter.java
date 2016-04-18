package com.sfy.adapter.objectadapter;

/**
 * @Description: ObjectAdapter.java
 * @Date: 2016/04/18
 * @Author: sunfayun
 * @Version: 1.0
 */
public class ObjectAdapter implements TargetInterface {

    private SourceClass sourceClass;

    public ObjectAdapter(SourceClass sourceClass){
        super();
        this.sourceClass = sourceClass;
    }

    @Override
    public void sourceMethod() {
        sourceClass.sourceMethod();
    }

    @Override
    public void targetMethod() {
        System.err.println("target method");
    }
}
