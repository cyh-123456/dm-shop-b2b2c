package com.dm.shopb2b2c.crm.order.service.impl;

import com.dm.shopb2b2c.crm.order.entity.JukeOrder;
import com.dm.shopb2b2c.crm.order.mapper.JukeOrderMapper;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * @Classname: JukeOrderServiceImpl
 * @Description： TODO
 * @Date: 2019/8/15 17:31
 * @Author: cyh
 */
@Service
public class JukeOrderServiceImpl implements IJukeOrderService {

    @Inject
    private JukeOrderMapper jukeOrderMapper;

    @Override
    public void addJukeOrder(JukeOrder jukeOrder) {
        jukeOrderMapper.addJukeOrder(jukeOrder);
    }
}
