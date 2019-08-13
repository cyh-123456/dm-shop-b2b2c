package com.dm.shopb2b2c.shopec.type.service.impl;

import com.dm.shopb2b2c.shopec.type.entity.ShopGoodsType;
import com.dm.shopb2b2c.shopec.type.mapper.ShopGoodsTypeMapper;
import com.dm.shopb2b2c.shopec.type.service.IShopGoodsTypeService;
import com.dm.shopb2b2c.shopec.typeAndBrand.entity.ShopTypeAndBrand;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

/**
 * @Classname: ShopGoodsTypeServiceImpl
 * @Description： TODO
 * @Date: 2019/8/9 17:28
 * @Author: cyh
 */
@Service
@Transactional
public class ShopGoodsTypeServiceImpl implements IShopGoodsTypeService {

    @Inject
    private ShopGoodsTypeMapper shopGoodsTypeMapper;

    //添加商城商品类型
    @Override
    public void addShopGoodsType(ShopGoodsType shopGoodsType){
        shopGoodsTypeMapper.addShopGoodsType(shopGoodsType);
    }

    @Override
    public long getShopDisTypeId(ShopTypeAndBrand shopTypeAndBrand) {
        return shopGoodsTypeMapper.getShopDisTypeId(shopTypeAndBrand);
    }
}
