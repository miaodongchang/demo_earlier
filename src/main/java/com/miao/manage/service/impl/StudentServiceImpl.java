package com.miao.manage.service.impl;

import com.miao.manage.dao.StudentDao;
import com.miao.manage.model.Student;
import com.miao.manage.service.StudentService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * 学生service实现
 *
 * @author miaodc
 * @create 2017-07-28 11:37
 */
@Service
public class StudentServiceImpl implements StudentService {
    private static Logger logger = Logger.getLogger(StudentServiceImpl.class);
    @Autowired
    private StudentDao studentDao;

    public List<Student> getList() {
        List<Student> list = studentDao.getList();
        return list;
    }

}
