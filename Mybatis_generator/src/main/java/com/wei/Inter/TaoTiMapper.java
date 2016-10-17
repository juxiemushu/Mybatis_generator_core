package com.wei.Inter;

import com.wei.Model.TaoTi;

public interface TaoTiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TaoTi record);

    int insertSelective(TaoTi record);

    TaoTi selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TaoTi record);

    int updateByPrimaryKey(TaoTi record);
}