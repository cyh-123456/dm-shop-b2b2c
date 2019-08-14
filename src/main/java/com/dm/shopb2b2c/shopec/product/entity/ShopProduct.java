package com.dm.shopb2b2c.shopec.product.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 商品
 * </p>
 *
 * @author cyh
 * @since 2019-08-14
 */
public class ShopProduct extends Model<ShopProduct> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private Long id;

    /**
     * 创建日期
     */
    private Date createdDate;

    /**
     * 最后修改日期
     */
    private Date lastModifiedDate;

    /**
     * 版本
     */
    private Long version;

    /**
     * 属性值0
     */
    private String attributeValue0;

    /**
     * 属性值1
     */
    private String attributeValue1;

    /**
     * 属性值10
     */
    private String attributeValue10;

    /**
     * 属性值11
     */
    private String attributeValue11;

    /**
     * 属性值12
     */
    private String attributeValue12;

    /**
     * 属性值13
     */
    private String attributeValue13;

    /**
     * 属性值14
     */
    private String attributeValue14;

    /**
     * 属性值15
     */
    private String attributeValue15;

    /**
     * 属性值16
     */
    private String attributeValue16;

    /**
     * 属性值17
     */
    private String attributeValue17;

    /**
     * 属性值18
     */
    private String attributeValue18;

    /**
     * 属性值19
     */
    private String attributeValue19;

    /**
     * 属性值2
     */
    private String attributeValue2;

    /**
     * 属性值3
     */
    private String attributeValue3;

    /**
     * 属性值4
     */
    private String attributeValue4;

    /**
     * 属性值5
     */
    private String attributeValue5;

    /**
     * 属性值6
     */
    private String attributeValue6;

    /**
     * 属性值7
     */
    private String attributeValue7;

    /**
     * 属性值8
     */
    private String attributeValue8;

    /**
     * 属性值9
     */
    private String attributeValue9;

    /**
     * 副标题
     */
    private String caption;

    /**
     * 成本价
     */
    private BigDecimal cost;

    /**
     * 点击数
     */
    private Long hits;

    /**
     * 介绍
     */
    private String introduction;

    /**
     * 是否有效
     */
    private Boolean isActive;

    /**
     * 是否需要物流
     */
    private Boolean isDelivery;

    /**
     * 是否列出
     */
    private Boolean isList;

    /**
     * 是否上架
     */
    private Boolean isMarketable;

    /**
     * 是否置顶
     */
    private Boolean isTop;

    /**
     * 搜索关键词
     */
    private String keyword;

    /**
     * 市场价
     */
    private BigDecimal marketPrice;

    /**
     * 最大佣金
     */
    private BigDecimal maxCommission;

    /**
     * 备注
     */
    private String memo;

    /**
     * 月点击数
     */
    private Long monthHits;

    /**
     * 月点击数更新日期
     */
    private Date monthHitsDate;

    /**
     * 月销量
     */
    private Long monthSales;

    /**
     * 月销量更新日期
     */
    private Date monthSalesDate;

    /**
     * 名称
     */
    private String name;

    /**
     * 参数值
     */
    private String parameterValues;

    /**
     * 销售价
     */
    private BigDecimal price;

    /**
     * 商品图片
     */
    private String productImages;

    /**
     * 销量
     */
    private Long sales;

    /**
     * 评分
     */
    private Float score;

    /**
     * 评分数
     */
    private Long scoreCount;

    /**
     * 编号
     */
    private String sn;

    /**
     * 规格项
     */
    private String specificationItems;

    /**
     * 总评分
     */
    private Long totalScore;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 单位
     */
    private String unit;

    /**
     * 周点击数
     */
    private Long weekHits;

    /**
     * 周点击数更新日期
     */
    private Date weekHitsDate;

    /**
     * 周销量
     */
    private Long weekSales;

    /**
     * 周销量更新日期
     */
    private Date weekSalesDate;

    /**
     * 重量
     */
    private Integer weight;

    /**
     * 品牌
     */
    private Long brandId;

    /**
     * 商品分类
     */
    private Long productCategoryId;

    /**
     * 店铺
     */
    private Long storeId;

    /**
     * 店铺商品分类
     */
    private Long storeProductCategoryId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getAttributeValue0() {
        return attributeValue0;
    }

    public void setAttributeValue0(String attributeValue0) {
        this.attributeValue0 = attributeValue0;
    }

    public String getAttributeValue1() {
        return attributeValue1;
    }

    public void setAttributeValue1(String attributeValue1) {
        this.attributeValue1 = attributeValue1;
    }

    public String getAttributeValue10() {
        return attributeValue10;
    }

    public void setAttributeValue10(String attributeValue10) {
        this.attributeValue10 = attributeValue10;
    }

    public String getAttributeValue11() {
        return attributeValue11;
    }

    public void setAttributeValue11(String attributeValue11) {
        this.attributeValue11 = attributeValue11;
    }

    public String getAttributeValue12() {
        return attributeValue12;
    }

    public void setAttributeValue12(String attributeValue12) {
        this.attributeValue12 = attributeValue12;
    }

    public String getAttributeValue13() {
        return attributeValue13;
    }

    public void setAttributeValue13(String attributeValue13) {
        this.attributeValue13 = attributeValue13;
    }

    public String getAttributeValue14() {
        return attributeValue14;
    }

    public void setAttributeValue14(String attributeValue14) {
        this.attributeValue14 = attributeValue14;
    }

    public String getAttributeValue15() {
        return attributeValue15;
    }

    public void setAttributeValue15(String attributeValue15) {
        this.attributeValue15 = attributeValue15;
    }

    public String getAttributeValue16() {
        return attributeValue16;
    }

    public void setAttributeValue16(String attributeValue16) {
        this.attributeValue16 = attributeValue16;
    }

    public String getAttributeValue17() {
        return attributeValue17;
    }

    public void setAttributeValue17(String attributeValue17) {
        this.attributeValue17 = attributeValue17;
    }

    public String getAttributeValue18() {
        return attributeValue18;
    }

    public void setAttributeValue18(String attributeValue18) {
        this.attributeValue18 = attributeValue18;
    }

    public String getAttributeValue19() {
        return attributeValue19;
    }

    public void setAttributeValue19(String attributeValue19) {
        this.attributeValue19 = attributeValue19;
    }

    public String getAttributeValue2() {
        return attributeValue2;
    }

    public void setAttributeValue2(String attributeValue2) {
        this.attributeValue2 = attributeValue2;
    }

    public String getAttributeValue3() {
        return attributeValue3;
    }

    public void setAttributeValue3(String attributeValue3) {
        this.attributeValue3 = attributeValue3;
    }

    public String getAttributeValue4() {
        return attributeValue4;
    }

    public void setAttributeValue4(String attributeValue4) {
        this.attributeValue4 = attributeValue4;
    }

    public String getAttributeValue5() {
        return attributeValue5;
    }

    public void setAttributeValue5(String attributeValue5) {
        this.attributeValue5 = attributeValue5;
    }

    public String getAttributeValue6() {
        return attributeValue6;
    }

    public void setAttributeValue6(String attributeValue6) {
        this.attributeValue6 = attributeValue6;
    }

    public String getAttributeValue7() {
        return attributeValue7;
    }

    public void setAttributeValue7(String attributeValue7) {
        this.attributeValue7 = attributeValue7;
    }

    public String getAttributeValue8() {
        return attributeValue8;
    }

    public void setAttributeValue8(String attributeValue8) {
        this.attributeValue8 = attributeValue8;
    }

    public String getAttributeValue9() {
        return attributeValue9;
    }

    public void setAttributeValue9(String attributeValue9) {
        this.attributeValue9 = attributeValue9;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Long getHits() {
        return hits;
    }

    public void setHits(Long hits) {
        this.hits = hits;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Boolean getDelivery() {
        return isDelivery;
    }

    public void setDelivery(Boolean isDelivery) {
        this.isDelivery = isDelivery;
    }

    public Boolean getList() {
        return isList;
    }

    public void setList(Boolean isList) {
        this.isList = isList;
    }

    public Boolean getMarketable() {
        return isMarketable;
    }

    public void setMarketable(Boolean isMarketable) {
        this.isMarketable = isMarketable;
    }

    public Boolean getTop() {
        return isTop;
    }

    public void setTop(Boolean isTop) {
        this.isTop = isTop;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public BigDecimal getMaxCommission() {
        return maxCommission;
    }

    public void setMaxCommission(BigDecimal maxCommission) {
        this.maxCommission = maxCommission;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Long getMonthHits() {
        return monthHits;
    }

    public void setMonthHits(Long monthHits) {
        this.monthHits = monthHits;
    }

    public Date getMonthHitsDate() {
        return monthHitsDate;
    }

    public void setMonthHitsDate(Date monthHitsDate) {
        this.monthHitsDate = monthHitsDate;
    }

    public Long getMonthSales() {
        return monthSales;
    }

    public void setMonthSales(Long monthSales) {
        this.monthSales = monthSales;
    }

    public Date getMonthSalesDate() {
        return monthSalesDate;
    }

    public void setMonthSalesDate(Date monthSalesDate) {
        this.monthSalesDate = monthSalesDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParameterValues() {
        return parameterValues;
    }

    public void setParameterValues(String parameterValues) {
        this.parameterValues = parameterValues;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getProductImages() {
        return productImages;
    }

    public void setProductImages(String productImages) {
        this.productImages = productImages;
    }

    public Long getSales() {
        return sales;
    }

    public void setSales(Long sales) {
        this.sales = sales;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Long getScoreCount() {
        return scoreCount;
    }

    public void setScoreCount(Long scoreCount) {
        this.scoreCount = scoreCount;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getSpecificationItems() {
        return specificationItems;
    }

    public void setSpecificationItems(String specificationItems) {
        this.specificationItems = specificationItems;
    }

    public Long getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Long totalScore) {
        this.totalScore = totalScore;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Long getWeekHits() {
        return weekHits;
    }

    public void setWeekHits(Long weekHits) {
        this.weekHits = weekHits;
    }

    public Date getWeekHitsDate() {
        return weekHitsDate;
    }

    public void setWeekHitsDate(Date weekHitsDate) {
        this.weekHitsDate = weekHitsDate;
    }

    public Long getWeekSales() {
        return weekSales;
    }

    public void setWeekSales(Long weekSales) {
        this.weekSales = weekSales;
    }

    public Date getWeekSalesDate() {
        return weekSalesDate;
    }

    public void setWeekSalesDate(Date weekSalesDate) {
        this.weekSalesDate = weekSalesDate;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getStoreProductCategoryId() {
        return storeProductCategoryId;
    }

    public void setStoreProductCategoryId(Long storeProductCategoryId) {
        this.storeProductCategoryId = storeProductCategoryId;
    }


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", createdDate=" + createdDate +
                ", lastModifiedDate=" + lastModifiedDate +
                ", version=" + version +
                ", attributeValue0=" + attributeValue0 +
                ", attributeValue1=" + attributeValue1 +
                ", attributeValue10=" + attributeValue10 +
                ", attributeValue11=" + attributeValue11 +
                ", attributeValue12=" + attributeValue12 +
                ", attributeValue13=" + attributeValue13 +
                ", attributeValue14=" + attributeValue14 +
                ", attributeValue15=" + attributeValue15 +
                ", attributeValue16=" + attributeValue16 +
                ", attributeValue17=" + attributeValue17 +
                ", attributeValue18=" + attributeValue18 +
                ", attributeValue19=" + attributeValue19 +
                ", attributeValue2=" + attributeValue2 +
                ", attributeValue3=" + attributeValue3 +
                ", attributeValue4=" + attributeValue4 +
                ", attributeValue5=" + attributeValue5 +
                ", attributeValue6=" + attributeValue6 +
                ", attributeValue7=" + attributeValue7 +
                ", attributeValue8=" + attributeValue8 +
                ", attributeValue9=" + attributeValue9 +
                ", caption=" + caption +
                ", cost=" + cost +
                ", hits=" + hits +
                ", introduction=" + introduction +
                ", isActive=" + isActive +
                ", isDelivery=" + isDelivery +
                ", isList=" + isList +
                ", isMarketable=" + isMarketable +
                ", isTop=" + isTop +
                ", keyword=" + keyword +
                ", marketPrice=" + marketPrice +
                ", maxCommission=" + maxCommission +
                ", memo=" + memo +
                ", monthHits=" + monthHits +
                ", monthHitsDate=" + monthHitsDate +
                ", monthSales=" + monthSales +
                ", monthSalesDate=" + monthSalesDate +
                ", name=" + name +
                ", parameterValues=" + parameterValues +
                ", price=" + price +
                ", productImages=" + productImages +
                ", sales=" + sales +
                ", score=" + score +
                ", scoreCount=" + scoreCount +
                ", sn=" + sn +
                ", specificationItems=" + specificationItems +
                ", totalScore=" + totalScore +
                ", type=" + type +
                ", unit=" + unit +
                ", weekHits=" + weekHits +
                ", weekHitsDate=" + weekHitsDate +
                ", weekSales=" + weekSales +
                ", weekSalesDate=" + weekSalesDate +
                ", weight=" + weight +
                ", brandId=" + brandId +
                ", productCategoryId=" + productCategoryId +
                ", storeId=" + storeId +
                ", storeProductCategoryId=" + storeProductCategoryId +
                "}";
    }
}

