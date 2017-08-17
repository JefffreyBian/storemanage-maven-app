package com.store.dao;

import com.store.model.payform;

public interface payformMapper {
    int deleteByPrimaryKey(String tPayformid);

    int insert(payform record);

    int insertSelective(payform record);

    payform selectByPrimaryKey(String tPayformid);

    int updateByPrimaryKeySelective(payform record);

    int updateByPrimaryKey(payform record);
}