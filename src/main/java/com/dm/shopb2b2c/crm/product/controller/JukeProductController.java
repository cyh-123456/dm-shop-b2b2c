package com.dm.shopb2b2c.crm.product.controller;

import com.dm.shopb2b2c.crm.product.service.IJukeProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;

/**
 * @Classname: JukeProductController
 * @Description： TODO
 * @Date: 2019/8/12 11:43
 * @Author: cyh
 */
@Controller
@RequestMapping("juke")
public class JukeProductController {

    @Inject
    private IJukeProductService iJukeProductService;

    @ResponseBody
    @RequestMapping("/showPro")
    public String showProduct(){
        return  iJukeProductService.getJukeProduct().size()+"";
    }
}
