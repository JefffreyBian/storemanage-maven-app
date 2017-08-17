package com.store.dao;

import com.store.model.saledetail;

public interface saledetailMapper {
    int deleteByPrimaryKey(String tSaleid);

    int insert(saledetail record);

    int insertSelective(saledetail record);

    saledetail selectByPrimaryKey(String tSaleid);

    int updateByPrimaryKeySelective(saledetail record);

    int updateByPrimaryKey(saledetail record);
}