package com.store.dao;

import java.util.List;

import com.store.model.mfr;

public interface mfrMapper {
    int deleteByPrimaryKey(String tMfrid);

    int insert(mfr record);

    int insertSelective(mfr record);

    mfr selectByPrimaryKey(String tMfrid);

    int updateByPrimaryKeySelective(mfr record);

    int updateByPrimaryKey(mfr record);
    List<mfr> queryforlistByPrimaryKey(mfr mfr);
    


}