package com.dm.shopb2b2c.crm.product.entity;

import javax.persistence.Entity;

/**
 * @Classname: Product
 * @Description： TODO
 * @Date: 2019/8/12 11:42
 * @Author: cyh
 */
@Entity
public class JukeProduct {
    private long id;
    private String name;
    private int type;
    private int create_time;
    private int be_del;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getCreate_time() {
        return create_time;
    }

    public void setCreate_time(int create_time) {
        this.create_time = create_time;
    }

    public int getBe_del() {
        return be_del;
    }

    public void setBe_del(int be_del) {
        this.be_del = be_del;
    }
}
