package com.dm.shopb2b2c.crm.order.controller;

import com.dm.shopb2b2c.crm.order.service.impl.IJukeOrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

/**
 * @Classname: JukeOrderController
 * @Description： TODO
 * @Date: 2019/8/15 17:33
 * @Author: cyh
 */
@RestController
@RequestMapping("/juke")
public class JukeOrderController {

    @Inject
    private IJukeOrderService iJukeOrderService;

    @RequestMapping("/addOrder")
    public String addJukeOrder(){
        iJukeOrderService.addJukeOrder(null);
        return  "OK";
    }
}
