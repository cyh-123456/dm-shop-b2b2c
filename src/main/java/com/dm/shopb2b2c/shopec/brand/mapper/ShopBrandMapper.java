package com.dm.shopb2b2c.shopec.brand.mapper;

import com.dm.shopb2b2c.shopec.brand.entity.ShopBrand;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Classname: BrandMapper
 * @Description： TODO
 * @Date: 2019/8/9 9:57
 * @Author: cyh
 */
@Mapper
public interface ShopBrandMapper {

    //查询全部
    public List<ShopBrand> findAllShopBrand();

    //添加数据
    public void addShopBrand(ShopBrand brand);

    //刪除全部
    public void delAllBrand();
}
