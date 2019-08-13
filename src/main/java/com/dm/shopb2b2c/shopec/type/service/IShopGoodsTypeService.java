package com.dm.shopb2b2c.shopec.type.service;

import com.dm.shopb2b2c.shopec.type.entity.ShopGoodsType;
import com.dm.shopb2b2c.shopec.typeAndBrand.entity.ShopTypeAndBrand;

/**
 * @Classname: IShopGoodsTypeService
 * @Description： TODO
 * @Date: 2019/8/9 17:28
 * @Author: cyh
 */
public interface IShopGoodsTypeService {
    public void addShopGoodsType(ShopGoodsType shopGoodsType);

    public long getShopDisTypeId(ShopTypeAndBrand shopTypeAndBrand);
}
