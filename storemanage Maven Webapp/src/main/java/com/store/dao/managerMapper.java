package com.store.dao;

import com.store.model.manager;

public interface managerMapper {
    int deleteByPrimaryKey(String tManagerid);

    int insert(manager record);

    int insertSelective(manager record);

    manager selectByPrimaryKey(String tManagerid);

    int updateByPrimaryKeySelective(manager record);

    int updateByPrimaryKey(manager record);
    
    manager queryforlistByPrimaryKey(String tManagerid);
    
    manager LoginCheckByPrimaryKey(manager manager);

}