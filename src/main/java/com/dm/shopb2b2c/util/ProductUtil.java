package com.dm.shopb2b2c.util;

import com.dm.shopb2b2c.crm.product.entity.JukeProduct;
import com.dm.shopb2b2c.shopec.product.entity.ShopProduct;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Classname: ProductUtil
 * @Description： TODO
 * @Date: 2019/8/14 16:02
 * @Author: cyh
 */
public class ProductUtil {

    public static List<ShopProduct> getAllProduct(List<JukeProduct> list){
        List<ShopProduct> myList=new ArrayList<>();
        for (JukeProduct jukePro: list) {
            ShopProduct shopProduct=new ShopProduct();
            shopProduct.setCreatedDate(new Date(jukePro.getCreate_time()));
            shopProduct.setCreatedDate(new Date());
            shopProduct.setVersion(0L);
            shopProduct.setCaption(jukePro.getDesc());
            shopProduct.setHits(0L);
            shopProduct.setIntroduction(jukePro.getDesc_min());
            shopProduct.setActive(true);
            shopProduct.setDelivery(true);
            shopProduct.setList(true);
            shopProduct.setMarketable(true);
            shopProduct.setTop(false);
            shopProduct.setMarketPrice(new BigDecimal(jukePro.getPrice_sell()));
            shopProduct.setMaxCommission(new BigDecimal(0));
            shopProduct.setMonthHits(0L);
            shopProduct.setMonthHitsDate(new Date());
            shopProduct.setMonthSales(0L);
            shopProduct.setMonthSalesDate(new Date());
            shopProduct.setName(jukePro.getGoods_name());
            shopProduct.setPrice(new BigDecimal(jukePro.getPrice_sell()));
            shopProduct.setProductImages(jukePro.getImg_icon());
            shopProduct.setSales(0L);
            shopProduct.setScore(0f);
            shopProduct.setScoreCount(0L);

            shopProduct.setTotalScore(0L);
            shopProduct.setType(1);
            shopProduct.setWeekHits(0L);
            shopProduct.setWeekHitsDate(new Date());
            shopProduct.setWeekSales(0L);
            shopProduct.setWeekSalesDate(new Date());
            //测试品牌id
            shopProduct.setBrandId((long) jukePro.getBrand_id());
            //测试类别id   全部类别一样
            shopProduct.setProductCategoryId(192706956058255360L);
            //测试门店id
            shopProduct.setStoreId(193419581008207872L);
            //测试门店分类id
            shopProduct.setStoreProductCategoryId(1L);
            myList.add(shopProduct);
        }
        return myList;
    }
}
