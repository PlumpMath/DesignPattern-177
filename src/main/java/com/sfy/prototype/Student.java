package com.sfy.prototype;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description: Student.java
 * @Date: 2016/04/18
 * @Author: sunfayun
 * @Version: 1.0
 */
@Data
public class Student implements Serializable {

    private Integer id;
    private String name;
    private String password;

}
