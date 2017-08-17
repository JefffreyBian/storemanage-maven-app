package com.store.dao;

import java.util.HashMap;
import java.util.List;

import com.store.model.sale;

public interface saleMapper {
    int deleteByPrimaryKey(String tSaleid);

    int insert(sale record);

    int insertSelective(sale record);

    sale selectByPrimaryKey(String tSaleid);

    int updateByPrimaryKeySelective(sale record);

    int updateByPrimaryKey(sale record);
    
    List<sale> queryforlistByPrimaryKey(sale sale);
    
    List<sale> querylistbytime(HashMap<String, Object> map);


}