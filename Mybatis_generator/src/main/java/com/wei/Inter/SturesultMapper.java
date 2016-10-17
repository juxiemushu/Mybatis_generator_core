package com.wei.Inter;

import com.wei.Model.Sturesult;

public interface SturesultMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Sturesult record);

    int insertSelective(Sturesult record);

    Sturesult selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Sturesult record);

    int updateByPrimaryKey(Sturesult record);
}