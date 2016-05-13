package com.sfy.filter;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * @Description: CriteriaMale.java
 * @Date: 2016/05/13
 * @Author: sunfayun
 * @Version: 1.0
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = Lists.newArrayList();
        for(Person person : persons){
            if(StringUtils.equalsIgnoreCase(person.getGender(),"MALE")){
                malePersons.add(person);
            }
        }

        return malePersons;
    }

}
