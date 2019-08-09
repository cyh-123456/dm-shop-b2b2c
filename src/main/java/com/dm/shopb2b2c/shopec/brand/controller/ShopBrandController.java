package com.dm.shopb2b2c.shopec.brand.controller;

import com.dm.shopb2b2c.crm.brand.entity.JukeBrand;
import com.dm.shopb2b2c.crm.brand.service.IJukeBrandService;
import com.dm.shopb2b2c.shopec.brand.entity.ShopBrand;
import com.dm.shopb2b2c.shopec.brand.service.IShopBrandService;
import com.dm.shopb2b2c.util.BrandUtil;
import com.dm.shopb2b2c.util.Sequence;
import org.minbox.framework.api.boot.plugin.datasource.annotation.DataSourceSwitch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * @Classname: BrandController
 * @Description： TODO
 * @Date: 2019/8/9 9:57
 * @Author: cyh
 */
@Controller("shopecBrandController")
@RequestMapping("/shop")
public class ShopBrandController {

    @Autowired
    private IShopBrandService iShopBrandService;

    @Autowired
    private IJukeBrandService iJukeBrandService;



    @DataSourceSwitch("juke")
    public List<JukeBrand> getData(){
       return iJukeBrandService.findJukeAll();
    }

    @RequestMapping("/addBrand")
    @ResponseBody
    public String addBrand(){
        //得到数据源
        List<JukeBrand> list= getData();
        //数据源转换
        List<ShopBrand> shopList=BrandUtil.getShopBrand(list);
        int i=0;
        //添加数据
        for (ShopBrand sb:shopList ) {
            sb.setId(new Sequence(1L).nextId());
            sb.setOrders(i);
            sb.setLast_modified_date(new Date());
            iShopBrandService.addShopBrand(sb);
        }
        return  "ok";
    }

    @RequestMapping("/showBrand")
    @ResponseBody
    @DataSourceSwitch("master")
    public String showBrand(){
        return  iShopBrandService.findAllShopBrand().size()+"";
    }

}
