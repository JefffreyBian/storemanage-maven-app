package com.store.dao;

import java.util.HashMap;
import java.util.List;

import com.store.model.user;

public interface userMapper {
    int deleteByPrimaryKey(String tUserid);

    int insert(user record);

    int insertSelective(user record);

    user selectByPrimaryKey(String tUserid);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);
    
    user queryforlistByPrimaryKey(String tUserid);
    
    user queryrcppaylist(String tUserid);
    
    user LoginCheckByPrimaryKey(user user);

    List<String> getsalechangebytime(HashMap<String,Object> map);
    
}