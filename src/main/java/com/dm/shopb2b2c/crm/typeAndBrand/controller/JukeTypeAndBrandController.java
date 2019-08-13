package com.dm.shopb2b2c.crm.typeAndBrand.controller;

import com.dm.shopb2b2c.crm.typeAndBrand.service.IJukeTypeAndBrandService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

/**
 * @Classname: JukeTypeAndBrandController
 * @Description： TODO
 * @Date: 2019/8/13 15:19
 * @Author: cyh
 */
@RestController
@RequestMapping("/juke")
public class JukeTypeAndBrandController {

    @Inject
    private IJukeTypeAndBrandService iJukeTypeAndBrandService;

    @RequestMapping("/showTb")
    public String showJukeTb(){
        return  iJukeTypeAndBrandService.findAll().size()+"";
    }
}
