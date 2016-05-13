package com.sfy.filter;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @Description: CriteriaPatternDemo.java
 * @Date: 2016/05/13
 * @Author: sunfayun
 * @Version: 1.0
 */
public class CriteriaPatternDemo {

    public static void main(String[] args) {
        List<Person> persons = Lists.newArrayList();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemal();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single,male);
        Criteria singleOrFemale = new OrCriteria(single,female);

        System.out.println("Males:");
        printPersons(male.meetCriteria(persons));

        System.out.println("\n Females:");
        printPersons(female.meetCriteria(persons));

        System.out.println("\n Single Males:");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\n Single Or Females:");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }

}
