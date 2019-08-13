package com.dm.shopb2b2c.crm.typeAndBrand.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import javax.persistence.Entity;

/**
 * @Classname: JukeTypeAndBrand
 * @Description： TODO
 * @Date: 2019/8/13 14:30
 * @Author: cyh
 */
@Entity
@TableName(value = "juke_brand_item")
public class JukeTypeAndBrand {
    private long juke_id;
    private long juke_brand_id;
    private int juke_type;
    private long juke_class_id;

    public long getJuke_brand_id() {
        return juke_brand_id;
    }

    public void setJuke_brand_id(long juke_brand_id) {
        this.juke_brand_id = juke_brand_id;
    }

    public long getJuke_id() {
        return juke_id;
    }

    public void setJuke_id(long juke_id) {
        this.juke_id = juke_id;
    }

    public int getJuke_type() {
        return juke_type;
    }

    public void setJuke_type(int juke_type) {
        this.juke_type = juke_type;
    }

    public long getJuke_class_id() {
        return juke_class_id;
    }

    public void setJuke_class_id(long juke_class_id) {
        this.juke_class_id = juke_class_id;
    }
}
