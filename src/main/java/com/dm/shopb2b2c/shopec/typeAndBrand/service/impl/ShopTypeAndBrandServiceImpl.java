package com.dm.shopb2b2c.shopec.typeAndBrand.service.impl;

import com.dm.shopb2b2c.shopec.typeAndBrand.entity.ShopTypeAndBrand;
import com.dm.shopb2b2c.shopec.typeAndBrand.mapper.ShopTypeAndBrandMapper;
import com.dm.shopb2b2c.shopec.typeAndBrand.service.IShopTypeAndBrandService;
import org.minbox.framework.api.boot.plugin.datasource.annotation.DataSourceSwitch;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

/**
 * @Classname: ShopTypeAndBrandServiceImpl
 * @Description： TODO
 * @Date: 2019/8/13 11:19
 * @Author: cyh
 */
@Service
@DataSourceSwitch("master")
@Transactional
public class ShopTypeAndBrandServiceImpl implements IShopTypeAndBrandService {

    @Inject
    private ShopTypeAndBrandMapper shopTypeAndBrandMapper;

    @Override
    public void addShopTypeAndBrand(ShopTypeAndBrand shopTB) {
        shopTypeAndBrandMapper.addShopTypeAndBrand(shopTB);
    }

    @Override
    public long findTypeId(long brandId) {
        return shopTypeAndBrandMapper.findTypeIdByBrandId(brandId);
    }
}
