package com.ang.springbootmybatis.mappers;

import com.ang.springbootmybatis.entities.Teacher;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherMapper {
    int insert(Teacher record);

    int insertSelective(Teacher record);
}