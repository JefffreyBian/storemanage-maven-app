package com.store.dao;

import com.store.model.pcdetail;

public interface pcdetailMapper {
    int deleteByPrimaryKey(String tPcdetailid);

    int insert(pcdetail record);

    int insertSelective(pcdetail record);

    pcdetail selectByPrimaryKey(String tPcdetailid);

    int updateByPrimaryKeySelective(pcdetail record);

    int updateByPrimaryKey(pcdetail record);
}