package com.dm.shopb2b2c.util;

import com.dm.shopb2b2c.crm.type.entity.JukeGoodsType;
import com.dm.shopb2b2c.shopec.type.entity.ShopGoodsType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Classname: GoodsTypeUtil
 * @Description： TODO
 * @Date: 2019/8/9 17:22
 * @Author: cyh
 */
public class GoodsTypeUtil {

    public static List<ShopGoodsType> getShopGoodsType(List<JukeGoodsType> list,long [] ids){

        List<ShopGoodsType> mylist=new ArrayList<>();
        Sequence seq=new Sequence(1L);
        for (JukeGoodsType jukeGoodsType:list){
            ShopGoodsType sp=new ShopGoodsType();
            long id=seq.nextId();
            sp.setId(id);
            sp.setCreated_date(new Date(jukeGoodsType.getCreate_time()));
            sp.setLast_modified_date(new Date());
            sp.setVersion(0);
            sp.setOrders(0);
            sp.setGeneral_rate(0);
            sp.setGrade(1);
            sp.setName(jukeGoodsType.getName());
            sp.setTree_path("2");
           switch (jukeGoodsType.getType()){
               case 11:
                   sp.setParent_id(ids[0]);
                   break;
               case 12:
                   sp.setParent_id(ids[1]);
                   break;
               case 13:
                   sp.setParent_id(ids[2]);
                   break;
               case 14:
                   sp.setParent_id(ids[3]);
                   break;
               case 15:
                   sp.setParent_id(ids[4]);
                   break;
               case 16:
                   sp.setParent_id(ids[5]);
                   break;
           }
            sp.setJuke_typeId(jukeGoodsType.getId());
            mylist.add(sp);
        }
        return mylist;

    }
}
