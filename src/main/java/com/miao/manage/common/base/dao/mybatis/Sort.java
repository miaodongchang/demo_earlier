package com.miao.manage.common.base.dao.mybatis;

import java.io.Serializable;

/**
 * 排序字段
 *
 * @author miaodc
 * @create 2017-07-28 11:33
 */
public class Sort implements Serializable {

    private static final long serialVersionUID = 7026434198845897214L;
    private String property;
    private Direction direction;
    public static enum Direction {
        ASC, DESC;
    }

    public Sort() {
        super();
        direction = Direction.ASC;
    }

    public Sort(String property) {
        this();
        this.property = property;
    }

    public Sort(String property, Direction direction) {
        this();
        this.property = property;
        this.direction = direction;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
