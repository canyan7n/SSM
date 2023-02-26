package com.canyan7n.spring.factorybean;

import com.canyan7n.spring.pojo.User;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/2/26 11:50
 */
public class MyFactoryBean implements FactoryBean {
    /**
     * @author: macheng
     * @description: TODO
     * @date: 2023/2/26 11:52
     * @param
     * @return
     */
    @Override
    public User getObject() throws Exception{
        return new User();
    }

    @Nullable
    public Class<?> getObjectType(){
        return User.class;
    }
}
