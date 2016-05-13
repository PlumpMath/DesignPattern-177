package com.sfy.filter;

import java.util.List;

/**
 * 标准接口
 * @Description: Criteria.java
 * @Date: 2016/05/13
 * @Author: sunfayun
 * @Version: 1.0
 */
public interface Criteria {

    /**
     * 获取满足标准的
     * @param persons
     * @return
     */
    List<Person> meetCriteria(List<Person> persons);

}
