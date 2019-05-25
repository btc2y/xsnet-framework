package com.x.s.model;

import javax.persistence.Transient;

/**
 * model基础信息
 * @author x.s
 */
public class BaseEntity  {

    @Transient
    private Integer offset = 0;

    @Transient
    private Integer limit = 10;

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
