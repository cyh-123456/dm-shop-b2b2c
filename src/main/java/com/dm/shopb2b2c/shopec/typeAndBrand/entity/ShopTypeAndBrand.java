package com.dm.shopb2b2c.shopec.typeAndBrand.entity;

/**
 * @Classname: ShopTypeAndBrand
 * @Description： TODO
 * @Date: 2019/8/13 10:59
 * @Author: cyh
 */
public class ShopTypeAndBrand {
    private long type_id;
    private long brand_id;
    private long juke_id;

    public long getJuke_id() {
        return juke_id;
    }

    public void setJuke_id(long juke_id) {
        this.juke_id = juke_id;
    }

    public long getType_id() {
        return type_id;
    }

    public void setType_id(long type_id) {
        this.type_id = type_id;
    }

    public long getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(long brand_id) {
        this.brand_id = brand_id;
    }
}
