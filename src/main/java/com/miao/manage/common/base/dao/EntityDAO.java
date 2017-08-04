/*
package com.miao.manage.common.base.dao;

import com.miao.manage.common.base.model.Entity;
import org.apache.ibatis.annotations.*;

import java.util.List;

*/
/**
 * 基础dao
 *
 * @author miaodc
 * @create 2017-07-28 11:33
 *//*

public interface EntityDAO<T extends Entity> {

    @InsertProvider(type = BaseSQLProvider.class, method = "getKey")
    public int generateId();

    @InsertProvider(type = BaseSQLProvider.class, method = "insert")
    public int insert(T t);

    @DeleteProvider(type = BaseSQLProvider.class, method = "delete")
    public int delete(Object id);

    @UpdateProvider(type = BaseSQLProvider.class, method = "update")
    public int update(T t);

    @SelectProvider(type = BaseSQLProvider.class, method = "getAll")
    @ResultMap("getMap")
    public List<T> getAll();

    @SelectProvider(type = BaseSQLProvider.class, method = "getById")
    @ResultMap("getMap")
    public T getById(Object id);

    @SelectProvider(type = BaseSQLProvider.class, method = "getOne")
    @ResultMap("getMap")
    public T getOne(@Param("findParams") T findParams);

    @SelectProvider(type = BaseSQLProvider.class, method = "getList")
    @ResultMap("getMap")
    public List<T> getList(@Param("findParams") T findParams);

    @SelectProvider(type = BaseSQLProvider.class, method = "getCount")
    public int getCount(@Param("findParams") T findParams);

    @SelectProvider(type = BaseSQLProvider.class, method = "queryCount")
    public int queryCount(@Param("queryParams") List<CustomQueryParam> customQueryParams);

    @SelectProvider(type = BaseSQLProvider.class, method = "query")
    @ResultMap("getMap")
    public List<T> query(@Param("queryParams") List<CustomQueryParam> customQueryParams, @Param("sortList") List<Sort> sortList, @Param("start") Integer start, @Param("limit") Integer limit);

}
*/
