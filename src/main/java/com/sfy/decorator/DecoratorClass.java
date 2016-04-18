package com.sfy.decorator;


/**
 * @Description: DecoratorClass.java
 * @Date: 2016/04/18
 * @Author: sunfayun
 * @Version: 1.0
 */
public class DecoratorClass implements DecoratorInterface {

    private SourceClass sourceClass;

    public DecoratorClass(SourceClass sourceClass){
        super();
        this.sourceClass = sourceClass;
    }

    @Override
    public void decoratorMethod() {
        System.err.println("before decorator");
        sourceClass.decoratorMethod();
        System.err.println("after decorator");
    }

}
