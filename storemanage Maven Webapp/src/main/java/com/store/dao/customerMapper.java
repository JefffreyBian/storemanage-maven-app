package com.store.dao;

import java.util.List;

import com.store.model.customer;

public interface customerMapper {
    int deleteByPrimaryKey(String tCustomerid);

    int insert(customer record);

    int insertSelective(customer record);

    customer selectByPrimaryKey(String tCustomerid);

    int updateByPrimaryKeySelective(customer record);

    int updateByPrimaryKey(customer record);
    
    List<customer> queryforlistByPrimaryKey(customer customer);

}