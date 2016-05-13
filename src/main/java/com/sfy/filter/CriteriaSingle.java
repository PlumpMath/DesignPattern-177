package com.sfy.filter;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * @Description: CriteriaSingle.java
 * @Date: 2016/05/13
 * @Author: sunfayun
 * @Version: 1.0
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = Lists.newArrayList();
        for(Person person : persons){
            if(StringUtils.equalsIgnoreCase(person.getMaritalStatus(),"SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
