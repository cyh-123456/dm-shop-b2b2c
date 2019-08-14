package com.dm.shopb2b2c.shopec.brand.service;

import com.dm.shopb2b2c.shopec.brand.entity.ShopBrand;
import com.dm.shopb2b2c.shopec.product.entity.ShopProduct;
import com.dm.shopb2b2c.shopec.typeAndBrand.entity.ShopTypeAndBrand;

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

    //查询单个分布式Id
    public long getShopDistributedBrandId(ShopTypeAndBrand shopTypeAndBrand);

    //根据商品查询商品品牌的分布式ID
    public long getProBrandId(ShopProduct shopProduct);
}
