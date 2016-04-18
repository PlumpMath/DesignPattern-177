package com.sfy.adapter.interfaceadapter;

/**
 * @Description: InterfaceAdapterTest.java
 * @Date: 2016/04/18
 * @Author: sunfayun
 * @Version: 1.0
 */
public class InterfaceAdapterTest {

    public static void main(String[] args) {
        InterfaceAdapter sourceClassOne = new SourceClassOne();
        sourceClassOne.sourceMethodOne();

        InterfaceAdapter sourceClassTwo = new SourceClassTwo();
        sourceClassTwo.sourceMethodSecond();
    }

}
