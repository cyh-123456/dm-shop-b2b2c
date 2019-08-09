package com.dm.shopb2b2c.util;

import com.dm.shopb2b2c.crm.brand.entity.JukeBrand;
import com.dm.shopb2b2c.shopec.brand.entity.ShopBrand;
import fr.xebia.extras.selma.Selma;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Classname: BrandUtil
 * @Description： TODO
 * @Date: 2019/8/9 14:37
 * @Author: cyh
 */
public class BrandUtil {

    public static List<ShopBrand> getShopBrand(List<JukeBrand> list){
        BrandSelma mapper=Selma.builder(BrandSelma.class).build();
        List<ShopBrand> mylist=new ArrayList<>();
        for (JukeBrand  jukeBrand:list) {
           ShopBrand shopBrand=new ShopBrand();
           shopBrand.setBrand_id(jukeBrand.getBrandId());
           shopBrand.setName(jukeBrand.getName());
           shopBrand.setType(1);
           shopBrand.setCreated_date(new Date(jukeBrand.getCreateTime()));

           mylist.add(shopBrand);
        }
        return  mylist;
    }
}
