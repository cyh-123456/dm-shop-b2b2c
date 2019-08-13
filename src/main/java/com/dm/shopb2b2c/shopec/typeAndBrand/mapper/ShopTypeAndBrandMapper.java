package com.dm.shopb2b2c.shopec.typeAndBrand.mapper;

import com.dm.shopb2b2c.shopec.typeAndBrand.entity.ShopTypeAndBrand;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Classname: ShopTypeAndBrandMapper
 * @Description： 类别品牌关联Mapper
 * @Date: 2019/8/13 11:16
 * @Author: cyh
 */
@Mapper
public interface ShopTypeAndBrandMapper {
    public void addShopTypeAndBrand(ShopTypeAndBrand shopTypeAndBrand);
}
