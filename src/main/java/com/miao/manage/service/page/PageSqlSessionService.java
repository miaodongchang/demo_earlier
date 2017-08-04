package com.miao.manage.service.page;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PageSqlSessionService<T> implements IPageSqlSessionService {

    private final Logger logger = LoggerFactory.getLogger(PageSqlSessionService.class);

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    public List<T> getList(String mapperId, Object parameter, int start, int pageSize) {
        SqlSession sqlSession = null;
        List<T> list = new ArrayList<T>();
        try {
            sqlSession = sqlSessionFactory.openSession();
            list = sqlSession.selectList(mapperId, parameter, new RowBounds(start, pageSize));
        } catch (Exception e) {
            logger.error("异常信息"+e.getMessage());
        } finally {
            if(sqlSession != null){
                sqlSession.close();
            }
        }
        return list;
    }

    public int getCount(String mapperId, Object parameter) {
        SqlSession sqlSession = null;
        int count = 0;
        try {
            sqlSession = sqlSessionFactory.openSession();
            count  = sqlSession.selectOne(mapperId, parameter);
        } catch (Exception e) {
            logger.error("异常信息"+e.getMessage());
        } finally {
            if(sqlSession != null){
                sqlSession.close();
            }
        }
        return count;
    }
}
