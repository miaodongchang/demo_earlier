package com.miao.manage.dao;

import com.miao.manage.model.Student;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 学生dao
 *
 * @author miaodc
 * @create 2017-07-28 11:31
 */
@Component
public interface StudentDao {

    /**
     * 查询学生列表
     * @return
     */
    List<Student> getList();

}
