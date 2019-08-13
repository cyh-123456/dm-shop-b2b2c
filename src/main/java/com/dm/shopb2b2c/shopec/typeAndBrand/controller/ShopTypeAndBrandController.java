package com.dm.shopb2b2c.shopec.typeAndBrand.controller;

import com.dm.shopb2b2c.crm.typeAndBrand.entity.JukeTypeAndBrand;
import com.dm.shopb2b2c.crm.typeAndBrand.service.IJukeTypeAndBrandService;
import com.dm.shopb2b2c.shopec.brand.service.IShopBrandService;
import com.dm.shopb2b2c.shopec.type.service.IShopGoodsTypeService;
import com.dm.shopb2b2c.shopec.typeAndBrand.entity.ShopTypeAndBrand;
import com.dm.shopb2b2c.shopec.typeAndBrand.service.IShopTypeAndBrandService;
import com.dm.shopb2b2c.util.TypeAndBrandUtil;
import org.minbox.framework.api.boot.plugin.datasource.annotation.DataSourceSwitch;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

/**
 * @Classname: ShopTypeAndBrandController
 * @Description： TODO
 * @Date: 2019/8/13 11:21
 * @Author: cyh
 */
@RestController
@RequestMapping("/shop")
public class ShopTypeAndBrandController {

    @Inject
    private IShopTypeAndBrandService shopTypeAndBrandService;

    @Inject
    private IShopBrandService iShopBrandService;

    @Inject
    private IShopGoodsTypeService iShopGoodsTypeService;

    @Inject
    private IJukeTypeAndBrandService iJukeTypeAndBrandService;


    //得到聚客品牌关联类型数据源
    @DataSourceSwitch("juke")
    public List<JukeTypeAndBrand>  getData(){
        return  iJukeTypeAndBrandService.findAll();
    }

    @RequestMapping("/addTb")
    public String addTypeAndBrand(){
        //得到插入的数据
        List<ShopTypeAndBrand> spList=TypeAndBrandUtil.getShopTbData(getData());
        for (int i=0;i<spList.size();i++)
        {
            long brandId=iShopBrandService.getShopDistributedBrandId(spList.get(i));
//            System.err.println(brandId+"_______________________________________________________________1");
            spList.get(i).setBrand_id(brandId);
//            System.err.println(spList.get(i).getBrand_id()+"________________________________________________2");

            //spList.get(i).getType_id();//通过这个id去查询当商城商品类型的分布式id
            long typeId=iShopGoodsTypeService.getShopDisTypeId(spList.get(i));
//            System.err.println(typeId+"________________________________________________3");
            spList.get(i).setType_id(typeId);
//            System.err.println(spList.get(i).getType_id()+"________________________________________________4");
            shopTypeAndBrandService.addShopTypeAndBrand(spList.get(i));
        }

        return  "ok";
    }
}
