package com.miao.manage.service.page;

import java.util.List;

/**
 * 分页(oracle数据库使用)
 *
 * @author miaodc
 * @create 2017-07-28 11:35
 */
public interface IPageSqlSessionService<T>  {
    /**
     * 查询总数
     * @param mapperId
     * @param parameter
     * @return
     */
    int getCount(String mapperId, Object parameter);

    /**
     * 分页查询列表
     * @param mapperId
     * @param parameter
     * @param start
     * @param pageSize
     * @return
     */
    List<T> getList(String mapperId, Object parameter, int start, int pageSize);

}
