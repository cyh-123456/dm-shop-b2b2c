package com.dm.shopb2b2c.crm.type.controller;

import com.dm.shopb2b2c.crm.type.service.IJukeGoodsTypeService;
import org.minbox.framework.api.boot.plugin.datasource.annotation.DataSourceSwitch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Classname: JukeGoodsTypeController
 * @Description： TODO
 * @Date: 2019/8/9 17:03
 * @Author: cyh
 */
@Controller
@RequestMapping("/juke")
public class JukeGoodsTypeController {

    @Autowired
    private IJukeGoodsTypeService iJukeGoodsTypeService;

    @RequestMapping("/showType")
    @DataSourceSwitch("juke")
    @ResponseBody
    public String showAllType(){
        return iJukeGoodsTypeService.getAllGoodsType().size()+"";
    }
}
