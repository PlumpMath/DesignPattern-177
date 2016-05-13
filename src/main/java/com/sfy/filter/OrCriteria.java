package com.sfy.filter;

import java.util.List;

/**
 * @Description: OrCriteria.java
 * @Date: 2016/05/13
 * @Author: sunfayun
 * @Version: 1.0
 */
public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria,Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {

        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

        for(Person person : otherCriteriaItems){
            if(!firstCriteriaItems.contains(person)){
                firstCriteriaItems.add(person);
            }
        }

        return firstCriteriaItems;
    }
}
