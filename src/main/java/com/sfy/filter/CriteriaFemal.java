package com.sfy.filter;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * @Description: CriteriaFemal.java
 * @Date: 2016/05/13
 * @Author: sunfayun
 * @Version: 1.0
 */
public class CriteriaFemal implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = Lists.newArrayList();

        for(Person person : persons){
            if(StringUtils.equalsIgnoreCase(person.getGender(),"FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
