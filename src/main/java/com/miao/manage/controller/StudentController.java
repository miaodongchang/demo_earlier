package com.miao.manage.controller;

import com.miao.manage.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 学生API
 *
 * @author miaodc
 * @create 2017-07-28 11:56
 */
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = {"/stu/list"})
    @ResponseBody
    public Object getStudentList(){
        return studentService.getList();
    }

}
