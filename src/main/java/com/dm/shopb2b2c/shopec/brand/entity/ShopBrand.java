package com.dm.shopb2b2c.shopec.brand.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * <p>
 * 商城品牌表
 * </p>
 *
 * @author cyh
 * @since 2019-08-09
 */
@TableName("brand")
public class ShopBrand {
    /**
     * 品牌编号
     */
    private long id;
    /**
     * 创建日期
     */
    private Date created_date;
    /**
     * 最后修改日期
     */
    private Date last_modified_date;
    /**
     * 版本
     */
    private int version;
    /**
     * 排序
     */
    private int orders;
    /**
     * 介绍
     */
    private String introduction;

    /**
     * logo
     */
    private String logo;

    /**
     * 名称
     */
    private String name;

    /**
     * 类型
     */
    private int type;

    /**
     * 网址
     */
    private String url;

    /**
     * 聚客ID
     */
    private int brand_id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public Date getLast_modified_date() {
        return last_modified_date;
    }

    public void setLast_modified_date(Date last_modified_date) {
        this.last_modified_date = last_modified_date;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getOrders() {
        return orders;
    }

    public void setOrders(int orders) {
        this.orders = orders;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }
}
