package com.dm.shopb2b2c.crm.brand.controller;

import com.dm.shopb2b2c.crm.brand.service.IJukeBrandService;
import org.minbox.framework.api.boot.plugin.datasource.annotation.DataSourceSwitch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Classname: JukeBrandController
 * @Description： TODO
 * @Date: 2019/8/8 18:53
 * @Author: cyh
 */
@Controller
@RequestMapping("/juke")
@DataSourceSwitch("juke")
public class JukeBrandController {

    @Autowired
    private IJukeBrandService jukeBrandService;

    @ResponseBody
    @GetMapping("/showBrand")
    public String findAll()
    {

        return  jukeBrandService.findJukeAll().size()+"";
    }

}
