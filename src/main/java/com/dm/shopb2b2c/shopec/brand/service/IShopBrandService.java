package com.dm.shopb2b2c.shopec.brand.service;

import com.dm.shopb2b2c.shopec.brand.entity.ShopBrand;

import java.util.List;

/**
 * @Classname: IBrandService
 * @Description： TODO
 * @Date: 2019/8/9 9:56
 * @Author: cyh
 */
public interface IShopBrandService {
    //查询接口
    public List<ShopBrand> findAllShopBrand();

    //添加接口
    public void addShopBrand(ShopBrand brand);

    //刪除全部
    public void delShopBrand();

}
