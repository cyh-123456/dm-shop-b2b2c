package com.dm.shopb2b2c.shopec.type.entity;

import java.util.Date;

/**
 * @Classname: ShopGoodsType
 * @Description： TODO
 * @Date: 2019/8/9 17:27
 * @Author: cyh
 */
public class ShopGoodsType {

    private long id;
    private Date created_date;
    private Date last_modified_date;
    private long version;
    private int orders;
    private double general_rate;
    private int grade;
    private String name;
    private String image;
    private double self_rate;
    private String seo_description;
    private String seo_keywords;
    private String seo_title;
    private String tree_path;
    private long parent_id;
    private long juke_typeId;



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

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public int getOrders() {
        return orders;
    }

    public void setOrders(int orders) {
        this.orders = orders;
    }

    public double getGeneral_rate() {
        return general_rate;
    }

    public void setGeneral_rate(double general_rate) {
        this.general_rate = general_rate;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getSelf_rate() {
        return self_rate;
    }

    public void setSelf_rate(double self_rate) {
        this.self_rate = self_rate;
    }

    public String getSeo_description() {
        return seo_description;
    }

    public void setSeo_description(String seo_description) {
        this.seo_description = seo_description;
    }

    public String getSeo_keywords() {
        return seo_keywords;
    }

    public void setSeo_keywords(String seo_keywords) {
        this.seo_keywords = seo_keywords;
    }

    public String getSeo_title() {
        return seo_title;
    }

    public void setSeo_title(String seo_title) {
        this.seo_title = seo_title;
    }

    public String getTree_path() {
        return tree_path;
    }

    public void setTree_path(String tree_path) {
        this.tree_path = tree_path;
    }

    public long getParent_id() {
        return parent_id;
    }

    public void setParent_id(long parent_id) {
        this.parent_id = parent_id;
    }

    public long getJuke_typeId() {
        return juke_typeId;
    }

    public void setJuke_typeId(long juke_typeId) {
        this.juke_typeId = juke_typeId;
    }
}
