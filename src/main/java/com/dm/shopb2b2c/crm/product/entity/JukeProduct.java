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
    private long goods_id;
    /**
     * 产品名称
     */
    private String goods_name;
    /**
     * 简单描述
     */
    private String desc_min;
    /**
     * 商品描述
     */
    private String desc;
    /**
     * 图标图片
     */
    private String img_icon;
    /**
     * 轮播图片
     */
    private String img_list;
    /**
     * 产品状态,0下架，1上架，2预售
     */
    private int status;
    /**
     * 现售价 (需要乘100，没有小数位)
     */
    private int price_sell;
    /**
     * 原价
     */
    private int price_old;
    /**
     * 活动价
     */
    private int price_act;
    /**
     * 活动开始时间
     */
    private int begin_time;
    /**
     * 活动结束时间
     */
    private int end_time;
    /**
     * 排序顺序，越大排后面
     */
    private int order;
    /**
     * 推广页链接
     */
    private String extend_links;
    /**
     * 品牌id
     */
    private int brand_id;
    /**
     * 型号id
     */
    private int model_id;
    /**
     * 排序
     */
    private int sort;
    /**
     * 0正常 1标记删除
     */
    private int be_del;
    /**
     * 创建时间
     */
    private int create_time;

    public long getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(long goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getDesc_min() {
        return desc_min;
    }

    public void setDesc_min(String desc_min) {
        this.desc_min = desc_min;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImg_icon() {
        return img_icon;
    }

    public void setImg_icon(String img_icon) {
        this.img_icon = img_icon;
    }

    public String getImg_list() {
        return img_list;
    }

    public void setImg_list(String img_list) {
        this.img_list = img_list;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getPrice_sell() {
        return price_sell;
    }

    public void setPrice_sell(int price_sell) {
        this.price_sell = price_sell;
    }

    public int getPrice_old() {
        return price_old;
    }

    public void setPrice_old(int price_old) {
        this.price_old = price_old;
    }

    public int getPrice_act() {
        return price_act;
    }

    public void setPrice_act(int price_act) {
        this.price_act = price_act;
    }

    public int getBegin_time() {
        return begin_time;
    }

    public void setBegin_time(int begin_time) {
        this.begin_time = begin_time;
    }

    public int getEnd_time() {
        return end_time;
    }

    public void setEnd_time(int end_time) {
        this.end_time = end_time;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getExtend_links() {
        return extend_links;
    }

    public void setExtend_links(String extend_links) {
        this.extend_links = extend_links;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public int getModel_id() {
        return model_id;
    }

    public void setModel_id(int model_id) {
        this.model_id = model_id;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getBe_del() {
        return be_del;
    }

    public void setBe_del(int be_del) {
        this.be_del = be_del;
    }

    public int getCreate_time() {
        return create_time;
    }

    public void setCreate_time(int create_time) {
        this.create_time = create_time;
    }
}
