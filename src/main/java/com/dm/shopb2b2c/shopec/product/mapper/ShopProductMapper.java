package com.dm.shopb2b2c.shopec.product.mapper;

import com.dm.shopb2b2c.shopec.product.entity.ShopProduct;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Classname: ShopProductMapper
 * @Description： TODO
 * @Date: 2019/8/12 14:27
 * @Author: cyh
 */
@Mapper
public interface ShopProductMapper {

    public void addShopProduct(ShopProduct shopProduct);
}
