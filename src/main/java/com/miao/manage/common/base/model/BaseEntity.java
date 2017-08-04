package com.miao.manage.common.base.model;

import java.util.Date;

/**
 * 基础实体
 *
 * @author miaodc
 * @create 2017-07-28 11:33
 */
public class BaseEntity extends Entity {

    protected Integer id;

    protected Date createTime;

    protected Date modifyTime;

    protected String operator;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
