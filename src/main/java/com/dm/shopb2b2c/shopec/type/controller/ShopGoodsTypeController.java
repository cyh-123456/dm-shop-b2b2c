package com.dm.shopb2b2c.shopec.type.controller;

import com.dm.shopb2b2c.crm.type.entity.JukeGoodsType;
import com.dm.shopb2b2c.crm.type.service.IJukeGoodsTypeService;
import com.dm.shopb2b2c.shopec.type.entity.ShopGoodsType;
import com.dm.shopb2b2c.shopec.type.service.IShopGoodsTypeService;
import com.dm.shopb2b2c.util.GoodsTypeUtil;
import com.dm.shopb2b2c.util.Sequence;
import org.minbox.framework.api.boot.plugin.datasource.annotation.DataSourceSwitch;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.Date;
import java.util.List;

/**
 * @Classname: ShopGoodsTypeController
 * @Description： TODO
 * @Date: 2019/8/9 17:27
 * @Author: cyh
 */
@Controller
@RequestMapping("/shop")
public class ShopGoodsTypeController {

    @Inject
    private IShopGoodsTypeService iShopGoodsTypeService;

    @Inject
    private IJukeGoodsTypeService iJukeGoodsTypeService;

    @DataSourceSwitch("juke")
    public List<JukeGoodsType> getData(){
        return iJukeGoodsTypeService.getAllGoodsType();
    }

    @RequestMapping("/addType")
    @ResponseBody
    public String addGoodsType(){
        //最初根节点
        ShopGoodsType sp=new ShopGoodsType();
        sp.setId(0);
        sp.setVersion(0);
        sp.setGeneral_rate(0);
        sp.setGrade(0);
        sp.setName("商品类型");
        sp.setSelf_rate(0);
        sp.setTree_path("0");
        sp.setParent_id(0);
        sp.setJuke_typeId(0);

        //insert into product_category values(0,null,null,0,0,0,0,"商品",null,0,null,null,null,"0",0,0);
        iShopGoodsTypeService.addShopGoodsType(sp);

        String typeNames[]=new String[]{"配件","电脑","穿戴","智能","保险","售后"};
        int types[]=new int[]{11,12,13,14,15,16};

        long ids[]=new long[6];
        ShopGoodsType shopGoodsType=new ShopGoodsType();
        Sequence seq=new Sequence(1L);
        for (int i=0;i<typeNames.length;i++){
            long newId=seq.nextId();
            shopGoodsType.setId(newId);
            ids[i]=newId;
            shopGoodsType.setCreated_date(new Date());
            shopGoodsType.setLast_modified_date(new Date());
            shopGoodsType.setVersion(0);
            shopGoodsType.setGeneral_rate(0);
            shopGoodsType.setGrade(0);
            shopGoodsType.setName(typeNames[i]);
            shopGoodsType.setSelf_rate(0);
            shopGoodsType.setTree_path("0");

            shopGoodsType.setJuke_typeId(0);
            iShopGoodsTypeService.addShopGoodsType(shopGoodsType);
        }

        //得到聚客数据
        List<JukeGoodsType> list=getData();
        //数据转换
        List<ShopGoodsType> shopList=GoodsTypeUtil.getShopGoodsType(list,ids);

        for (ShopGoodsType shopType: shopList) {
            iShopGoodsTypeService.addShopGoodsType(shopType);
        }
        return  "OK";
    }


    @RequestMapping("/addRoot")
    @ResponseBody
    public String addRootType(){

        return  "add ok！";
    }
}
