package com.wei.Inter;

import com.wei.Model.Student;

public interface StudentMapper {
    int insert(Student record);

    int insertSelective(Student record);
}