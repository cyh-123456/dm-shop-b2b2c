package com.dm.shopb2b2c.crm.order.entity;

/**
 * @Classname: JukeOrder
 * @Description： TODO
 * @Date: 2019/8/15 16:28
 * @Author: cyh
 */

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author cyh
 * @since 2019-08-15
 */
@TableName("juke_order")
public class JukeOrder extends Model<JukeOrder> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long gzhid;

    /**
     * 父级
     */
    private Integer pid;

    /**
     * 店铺id
     */
    private Long storeId;

    /**
     * 粉丝id
     */
    private Long fanId;

    /**
     * 店员id
     */
    private Long clerkId;

    /**
     * 订单id
     */
    private Long orderId;

    /**
     * 订单号
     */
    private String orderSn;

    /**
     * 有赞订单号
     */
    private String outOrderSn;

    /**
     * 手机IMEI码
     */
    private String imei;

    /**
     * 价格
     */
    private Integer price;

    /**
     * 售价
     */
    private Integer salePrice;

    /**
     * 最后的价格
     */
    private Integer finalPrice;

    /**
     * 利润
     */
    private Integer profit;

    /**
     * 成本
     */
    private Integer cost;

    /**
     * 数量
     */
    private Integer num;

    /**
     * 电话号码
     */
    private String customerPhone;

    /**
     * 客户名字
     */
    private String customerName;

    /**
     * 0 普通订单  1多订单
     */
    private Boolean orderType;

    /**
     * 操作类型 0 手机订单 1 号卡 2 宽带 3 ITV 4 配件 5 数码产品 6 融合  10业务  11配件 12电脑 13穿戴 14智能 15保险 16服务
     */
    private Boolean type;

    /**
     * 0为未读  1为已读
     */
    private Boolean isRead;

    /**
     * 是否修改  0 否  1是
     */
    private Boolean isChange;

    /**
     * 轨迹状态 0 未  1已
     */
    private Boolean isLocus;

    /**
     * 0 正常  1审核中  2审核通过  3审核不通过 4修改订单
     */
    private Boolean status;

    /**
     * 付款备注对外
     */
    private String payRemarkOut;

    /**
     * 付款备注对内
     */
    private String payRemarkIn;

    /**
     * 商品编码
     */
    private String goodscode;

    /**
     * 仓库编码
     */
    private String storecode;

    /**
     * 迈尔汛销售价格
     */
    private BigDecimal saleprice;


    /**
     * 考核底价
     */
    private BigDecimal coachprice;

    /**
     * 属性
     */
    private String itemid;

    /**
     * 迈尔讯订单号
     */
    private String billid;

    /**
     * es 退货返回的
     */
    private String esRefSn;

    /**
     * mex json数据
     */
    private String mexJson;

    /**
     * 备注
     */
    private String remark;

    /**
     * 0 正常 1删除
     */
    private Boolean beDel;

    /**
     * 0 未付款  1已付款
     */
    private Boolean payStatus;

    /**
     * 1 未激活  2已激活
     */
    private Boolean isActivate;

    /**
     * 客户签名
     */
    private String signature;

    /**
     * 编辑时间
     */
    private Integer editTime;

    /**
     * 操作时间
     */
    private Integer createTime;

    private Boolean re;

    /**
     * 购买次数
     */
    private Boolean bStatus;

    /**
     * 购机
     */
    private Boolean pStatus;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGzhid() {
        return gzhid;
    }

    public void setGzhid(Long gzhid) {
        this.gzhid = gzhid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getFanId() {
        return fanId;
    }

    public void setFanId(Long fanId) {
        this.fanId = fanId;
    }

    public Long getClerkId() {
        return clerkId;
    }

    public void setClerkId(Long clerkId) {
        this.clerkId = clerkId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getOutOrderSn() {
        return outOrderSn;
    }

    public void setOutOrderSn(String outOrderSn) {
        this.outOrderSn = outOrderSn;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Integer salePrice) {
        this.salePrice = salePrice;
    }

    public Integer getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(Integer finalPrice) {
        this.finalPrice = finalPrice;
    }

    public Integer getProfit() {
        return profit;
    }

    public void setProfit(Integer profit) {
        this.profit = profit;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Boolean getOrderType() {
        return orderType;
    }

    public void setOrderType(Boolean orderType) {
        this.orderType = orderType;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Boolean getRead() {
        return isRead;
    }

    public void setRead(Boolean isRead) {
        this.isRead = isRead;
    }

    public Boolean getChange() {
        return isChange;
    }

    public void setChange(Boolean isChange) {
        this.isChange = isChange;
    }

    public Boolean getLocus() {
        return isLocus;
    }

    public void setLocus(Boolean isLocus) {
        this.isLocus = isLocus;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getPayRemarkOut() {
        return payRemarkOut;
    }

    public void setPayRemarkOut(String payRemarkOut) {
        this.payRemarkOut = payRemarkOut;
    }

    public String getPayRemarkIn() {
        return payRemarkIn;
    }

    public void setPayRemarkIn(String payRemarkIn) {
        this.payRemarkIn = payRemarkIn;
    }

    public String getGoodscode() {
        return goodscode;
    }

    public void setGoodscode(String goodscode) {
        this.goodscode = goodscode;
    }

    public String getStorecode() {
        return storecode;
    }

    public void setStorecode(String storecode) {
        this.storecode = storecode;
    }

    public BigDecimal getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(BigDecimal saleprice) {
        this.saleprice = saleprice;
    }

    public BigDecimal getCoachprice() {
        return coachprice;
    }

    public void setCoachprice(BigDecimal coachprice) {
        this.coachprice = coachprice;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public String getBillid() {
        return billid;
    }

    public void setBillid(String billid) {
        this.billid = billid;
    }

    public String getEsRefSn() {
        return esRefSn;
    }

    public void setEsRefSn(String esRefSn) {
        this.esRefSn = esRefSn;
    }

    public String getMexJson() {
        return mexJson;
    }

    public void setMexJson(String mexJson) {
        this.mexJson = mexJson;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Boolean getBeDel() {
        return beDel;
    }

    public void setBeDel(Boolean beDel) {
        this.beDel = beDel;
    }

    public Boolean getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Boolean payStatus) {
        this.payStatus = payStatus;
    }

    public Boolean getActivate() {
        return isActivate;
    }

    public void setActivate(Boolean isActivate) {
        this.isActivate = isActivate;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Integer getEditTime() {
        return editTime;
    }

    public void setEditTime(Integer editTime) {
        this.editTime = editTime;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Boolean getRe() {
        return re;
    }

    public void setRe(Boolean re) {
        this.re = re;
    }

    public Boolean getbStatus() {
        return bStatus;
    }

    public void setbStatus(Boolean bStatus) {
        this.bStatus = bStatus;
    }

    public Boolean getpStatus() {
        return pStatus;
    }

    public void setpStatus(Boolean pStatus) {
        this.pStatus = pStatus;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", gzhid=" + gzhid +
                ", pid=" + pid +
                ", storeId=" + storeId +
                ", fanId=" + fanId +
                ", clerkId=" + clerkId +
                ", orderId=" + orderId +
                ", orderSn=" + orderSn +
                ", outOrderSn=" + outOrderSn +
                ", imei=" + imei +
                ", price=" + price +
                ", salePrice=" + salePrice +
                ", finalPrice=" + finalPrice +
                ", profit=" + profit +
                ", cost=" + cost +
                ", num=" + num +
                ", customerPhone=" + customerPhone +
                ", customerName=" + customerName +
                ", orderType=" + orderType +
                ", type=" + type +
                ", isRead=" + isRead +
                ", isChange=" + isChange +
                ", isLocus=" + isLocus +
                ", status=" + status +
                ", payRemarkOut=" + payRemarkOut +
                ", payRemarkIn=" + payRemarkIn +
                ", goodscode=" + goodscode +
                ", storecode=" + storecode +
                ", saleprice=" + saleprice +
                ", coachprice=" + coachprice +
                ", itemid=" + itemid +
                ", billid=" + billid +
                ", esRefSn=" + esRefSn +
                ", mexJson=" + mexJson +
                ", remark=" + remark +
                ", beDel=" + beDel +
                ", payStatus=" + payStatus +
                ", isActivate=" + isActivate +
                ", signature=" + signature +
                ", editTime=" + editTime +
                ", createTime=" + createTime +
                ", re=" + re +
                ", bStatus=" + bStatus +
                ", pStatus=" + pStatus +
                "}";
    }
}

