package com.wjs.springbootdemo.dao;

import com.wjs.springbootdemo.domain.tt;

public interface ttMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tt record);

    int insertSelective(tt record);

    tt selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(tt record);

    int updateByPrimaryKey(tt record);
}