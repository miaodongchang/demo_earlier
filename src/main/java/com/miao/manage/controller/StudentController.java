package com.miao.manage.controller;

import com.miao.manage.model.Student;
import com.miao.manage.service.StudentService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 学生API
 *
 * @author miaodc
 * @create 2017-07-28 11:56
 */
@Controller
public class StudentController {
    private static Logger logger = Logger.getLogger(StudentController.class);
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = {"/stu/list"},produces = {"application/json"})
    @ResponseBody
    public Object getStudentList(){
        List<Student> list = studentService.getList();
        logger.info("=======students=======:"+list);
        return list;
    }

}
