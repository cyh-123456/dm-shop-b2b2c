package com.dm.shopb2b2c.crm.brand.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 品牌表
 * </p>
 *
 * @author cyh
 * @since 2019-08-08
 */
@TableName("juke_brand")
public class JukeBrand extends Model<JukeBrand> {

    private static final long serialVersionUID=1L;

    /**
     * 品牌ID
     */
    @TableId(value = "brand_id", type = IdType.AUTO)
    private int brandId;

    /**
     * 名称
     */
    private String name;

    /**
     * 别名
     */
    private String otherName;

    private Integer sort;

    private Boolean beDel;

    /**
     * 创建时间
     */
    private Integer createTime;


    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Boolean getBeDel() {
        return beDel;
    }

    public void setBeDel(Boolean beDel) {
        this.beDel = beDel;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.brandId;
    }

    @Override
    public String toString() {
        return "Brand{" +
        "brandId=" + brandId +
        ", name=" + name +
        ", otherName=" + otherName +
        ", sort=" + sort +
        ", beDel=" + beDel +
        ", createTime=" + createTime +
        "}";
    }
}
