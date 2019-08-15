package com.dm.shopb2b2c.util;

import com.dm.shopb2b2c.crm.typeAndBrand.entity.JukeTypeAndBrand;
import com.dm.shopb2b2c.shopec.typeAndBrand.entity.ShopTypeAndBrand;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname: TypeAndBrandUtil
 * @Description： TODO
 * @Date: 2019/8/13 14:27
 * @Author: cyh
 */
public class TypeAndBrandUtil {

    public static List<ShopTypeAndBrand> getShopTbData(List<JukeTypeAndBrand> list){
        List<ShopTypeAndBrand> myList=new ArrayList<>();
        for (JukeTypeAndBrand jukeTB:list) {
            ShopTypeAndBrand shopTypeAndBrand=new ShopTypeAndBrand();
            shopTypeAndBrand.setBrand_id(jukeTB.getJuke_brand_id());
            shopTypeAndBrand.setType_id(jukeTB.getJuke_type());
            shopTypeAndBrand.setJuke_id(jukeTB.getJuke_id());
            myList.add(shopTypeAndBrand);
        }
        return  myList;
    }
}
