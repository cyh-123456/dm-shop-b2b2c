package com.dm.shopb2b2c.shopec.type.controller;

import com.dm.shopb2b2c.shopec.type.entity.ShopGoodsType;
import com.dm.shopb2b2c.shopec.type.service.IShopGoodsTypeService;
import org.minbox.framework.api.boot.plugin.datasource.annotation.DataSourceSwitch;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;

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

    @RequestMapping("/addType")
    @ResponseBody
    @DataSourceSwitch("master")
    public String addGoodsType(){
        ShopGoodsType sp=new ShopGoodsType();
        sp.setId(500);
        sp.setVersion(0);
        sp.setOrders(9);
        sp.setGeneral_rate(0.5);
        sp.setGrade(0);
        sp.setName("猪肉");
        sp.setSelf_rate(0);
        sp.setSeo_description("嘻嘻猪肉");
        sp.setSeo_keywords("嘻嘻");
        sp.setSeo_title("标题");
        sp.setTree_path(",1,");
        sp.setParent_id(1);
        iShopGoodsTypeService.addShopGoodsType(sp);
        return  "OK";
    }
}
