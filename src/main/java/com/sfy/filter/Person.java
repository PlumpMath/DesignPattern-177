package com.sfy.filter;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 过滤器模式：
 * 过滤器模式（Filter Pattern）或标准模式（Criteria Pattern）是一种设计模式，这种模式允许开发人员使用不同的标准来过滤一组对象，
 * 通过逻辑运算以解耦的方式把它们连接起来。这种类型的设计模式属于结构型模式，它结合多个标准来获得单一标准。
 * @Description: Person.java
 * @Date: 2016/05/13
 * @Author: sunfayun
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
public class Person {

    private String name;
    private String gender;
    private String maritalStatus;

}
