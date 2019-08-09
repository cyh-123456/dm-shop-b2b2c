package com.dm.shopb2b2c.shopec.brand.service.impl;

import com.dm.shopb2b2c.shopec.brand.entity.ShopBrand;
import com.dm.shopb2b2c.shopec.brand.mapper.ShopBrandMapper;
import com.dm.shopb2b2c.shopec.brand.service.IShopBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Classname: BrandServiceImpl
 * @Description： TODO
 * @Date: 2019/8/9 9:56
 * @Author: cyh
 */
@Service
@Transactional
public class ShopBrandServiceImpl implements IShopBrandService {

    @Autowired
    private ShopBrandMapper shopBrandMapper;
    //查询全部
    @Override
    public List<ShopBrand> findAllShopBrand(){
        return shopBrandMapper.findAllShopBrand();
    }
    //添加数据
    @Override
    public void addShopBrand(ShopBrand brand){
        shopBrandMapper.addShopBrand(brand);
    }

    @Override
    public void delShopBrand() {
        shopBrandMapper.delAllBrand();
    }
}
