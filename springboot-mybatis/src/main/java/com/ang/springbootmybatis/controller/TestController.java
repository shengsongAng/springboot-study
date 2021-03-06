package com.ang.springbootmybatis.controller;

import com.ang.springbootmybatis.entities.Teacher;
import com.ang.springbootmybatis.mappers.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    TeacherMapper teacherMapper;

    @RequestMapping("/testInsert")
    @ResponseBody
    public void testInsert(@RequestBody(required = false) Teacher teacher) {

        teacherMapper.insert(teacher);

    }
}
