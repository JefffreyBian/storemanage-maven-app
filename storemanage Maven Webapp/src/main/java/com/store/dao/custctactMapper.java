package com.store.dao;

import com.store.model.custctact;

public interface custctactMapper {
    int deleteByPrimaryKey(String tCcid);

    int insert(custctact record);

    int insertSelective(custctact record);

    custctact selectByPrimaryKey(String tCcid);

    int updateByPrimaryKeySelective(custctact record);

    int updateByPrimaryKey(custctact record);
}