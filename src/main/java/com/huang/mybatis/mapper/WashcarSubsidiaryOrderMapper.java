package com.huang.mybatis.mapper;

import com.huang.mybatis.pojo.WashcarSubsidiaryOrder;

public interface WashcarSubsidiaryOrderMapper {
    int insert(WashcarSubsidiaryOrder record);

    int insertSelective(WashcarSubsidiaryOrder record);
}