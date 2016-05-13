package com.sfy.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式
 * @Description: Employee.java
 * @Date: 2016/05/13
 * @Author: sunfayun
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
public class Employee {

    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public Employee(String name,String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<Employee>();
    }

    public String toString(){
        return ("Employee :[ Name : "+ name
                +", dept : "+ dept + ", salary :"
                + salary+" ]");
    }
}
