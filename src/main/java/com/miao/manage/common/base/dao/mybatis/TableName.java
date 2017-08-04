package com.miao.manage.common.base.dao.mybatis;

import java.lang.annotation.*;

/**
 * 配置数据库表名注解
 *
 * @author miaodc
 * @create 2017-07-28 11:33
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TableName {
    String name() default "";
}
