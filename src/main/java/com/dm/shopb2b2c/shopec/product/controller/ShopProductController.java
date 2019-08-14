package com.dm.shopb2b2c.shopec.product.controller;

import com.dm.shopb2b2c.crm.product.entity.JukeProduct;
import com.dm.shopb2b2c.crm.product.service.IJukeProductService;
import com.dm.shopb2b2c.shopec.brand.service.IShopBrandService;
import com.dm.shopb2b2c.shopec.product.entity.ShopProduct;
import com.dm.shopb2b2c.shopec.product.service.IShopProductService;
import com.dm.shopb2b2c.shopec.type.service.IShopGoodsTypeService;
import com.dm.shopb2b2c.util.ProductUtil;
import com.dm.shopb2b2c.util.Sequence;
import org.minbox.framework.api.boot.plugin.datasource.annotation.DataSourceSwitch;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

/**
 * @Classname: ShopProductController
 * @Description： TODO
 * @Date: 2019/8/12 14:27
 * @Author: cyh
 */
@RestController
@RequestMapping("/shop")
public class ShopProductController {

    @Inject
    private IJukeProductService iJukeProductService;

    @Inject
    private IShopProductService iShopProductService;

    @Inject
    private IShopBrandService iShopBrandService;

    @Inject
    private IShopGoodsTypeService iShopGoodsTypeService;

    @DataSourceSwitch("juke")
    public List<JukeProduct> getData(){
        return  iJukeProductService.getJukeProduct();
    }
    @RequestMapping("/addPro")
    public String addProduct(){
        //得到聚客数据
        List<JukeProduct> jukeList=getData();
        List<ShopProduct> spList=ProductUtil.getAllProduct(jukeList);
        long brandId;
        for (int i=0;i<spList.size();i++){
            Sequence seq=new Sequence(1L);
            Sequence sequence=new Sequence(1L);
            spList.get(i).setId(seq.nextId());
            spList.get(i).setSn(sequence.nextId()+"");
            //System.err.println( spList.get(i).getBrandId()+"_______________________________________1");
            brandId=iShopBrandService.getProBrandId( spList.get(i));
            //System.err.println(brandId+"__________________________________________2");
            spList.get(i).setBrandId(brandId);
            //聚客商品无类型？
            //long typeId=iShopGoodsTypeService.getProTypeId(spList.get(i));
            //spList.get(i).setProductCategoryId(typeId);
            iShopProductService.addShopProduct( spList.get(i));
        }

        return  "ok";
    }
}
