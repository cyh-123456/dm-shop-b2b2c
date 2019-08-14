package com.dm.shopb2b2c.shopec.product.service.impl;

import com.dm.shopb2b2c.shopec.product.entity.ShopProduct;
import com.dm.shopb2b2c.shopec.product.mapper.ShopProductMapper;
import com.dm.shopb2b2c.shopec.product.service.IShopProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

/**
 * @Classname: ShopProductServiceImpl
 * @Description： TODO
 * @Date: 2019/8/12 14:29
 * @Author: cyh
 */
@Service
@Transactional
public class ShopProductServiceImpl implements IShopProductService {
    @Inject
    private ShopProductMapper shopProductMapper;

    @Override
    public void addShopProduct(ShopProduct shopProduct){
        shopProductMapper.addShopProduct(shopProduct);
    }
}
