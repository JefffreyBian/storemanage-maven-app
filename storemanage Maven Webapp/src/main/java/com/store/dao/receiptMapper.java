package com.store.dao;

import com.store.model.receipt;

public interface receiptMapper {
    int deleteByPrimaryKey(String tReceiptid);

    int insert(receipt record);

    int insertSelective(receipt record);

    receipt selectByPrimaryKey(String tReceiptid);

    int updateByPrimaryKeySelective(receipt record);

    int updateByPrimaryKey(receipt record);
}