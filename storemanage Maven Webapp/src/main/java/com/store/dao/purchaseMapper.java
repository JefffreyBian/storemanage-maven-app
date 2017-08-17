package com.store.dao;

import java.util.HashMap;
import java.util.List;

import com.store.model.purchase;

public interface purchaseMapper {
    int deleteByPrimaryKey(String tPurcahseid);

    int insert(purchase record);

    int insertSelective(purchase record);

    purchase selectByPrimaryKey(String tPurcahseid);

    int updateByPrimaryKeySelective(purchase record);

    int updateByPrimaryKey(purchase record);
    
    List<purchase> queryforlistByPrimaryKey(purchase purchase);
    
    List<purchase> querylistbytime(HashMap<String, Object> map);


}