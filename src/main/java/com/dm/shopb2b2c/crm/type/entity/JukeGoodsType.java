package com.dm.shopb2b2c.crm.type.entity;

/**
 * @Classname: JukeGoodsType
 * @Description： 聚客商城商品类别实体
 * @Date: 2019/8/9 17:03
 * @Author: cyh
 */
public class JukeGoodsType {

    /**
     * 类型编号
     */
    private long id;
    /**
     * 产品名称
     */
    private String name;
    /**
     * 类型 11配件 12电脑 13穿戴 14智能 15保险
     */
    private int type;
    /**
     * 创建时间
     */
    private int create_time;
    /**
     * 0正常 1标记删除
     */
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
