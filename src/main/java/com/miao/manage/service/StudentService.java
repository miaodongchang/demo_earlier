package com.miao.manage.service;

import com.miao.manage.model.Student;

import java.util.List;

/**
 * 学生service
 *
 * @author miaodc
 * @create 2017-07-28 11:35
 */
public interface StudentService {

    /**
     * 查询学生列表
     * @return
     */
    List<Student> getList();

}
