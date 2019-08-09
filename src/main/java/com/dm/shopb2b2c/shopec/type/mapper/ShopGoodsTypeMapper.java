package com.dm.shopb2b2c.shopec.type.mapper;

import com.dm.shopb2b2c.shopec.type.entity.ShopGoodsType;
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
}
