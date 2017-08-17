package com.store.dao;

import com.store.model.product;

public interface productMapper {
    int deleteByPrimaryKey(String tProid);

    int insert(product record);

    int insertSelective(product record);

    product selectByPrimaryKey(String tProid);

    int updateByPrimaryKeySelective(product record);

    int updateByPrimaryKey(product record);
}