package com.dm.shopb2b2c.shopec.type.mapper;

import com.dm.shopb2b2c.shopec.product.entity.ShopProduct;
import com.dm.shopb2b2c.shopec.type.entity.ShopGoodsType;
import com.dm.shopb2b2c.shopec.typeAndBrand.entity.ShopTypeAndBrand;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Classname: ShopGoodsTypeMapper
 * @Description： TODO
 * @Date: 2019/8/9 17:27
 * @Author: cyh
 */
@Mapper
public interface ShopGoodsTypeMapper {

    //添加类型
    public void addShopGoodsType(ShopGoodsType shopGoodsType);

    //得到商品信息类别的分布式ID
    public long getShopDisTypeId(ShopTypeAndBrand shopTypeAndBrand);

    //根据传入的商品查询商品类别表得到分布式ID
    public long getProTypeId(ShopProduct shopProduct);
}
