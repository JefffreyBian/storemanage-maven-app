package com.store.dao;

import com.store.model.mfrctact;

public interface mfrctactMapper {
    int deleteByPrimaryKey(String tMfrcontactid);

    int insert(mfrctact record);

    int insertSelective(mfrctact record);

    mfrctact selectByPrimaryKey(String tMfrcontactid);

    int updateByPrimaryKeySelective(mfrctact record);

    int updateByPrimaryKey(mfrctact record);
}