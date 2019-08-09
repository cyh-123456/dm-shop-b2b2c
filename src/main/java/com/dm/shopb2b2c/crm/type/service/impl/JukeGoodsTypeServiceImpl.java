package com.dm.shopb2b2c.crm.type.service.impl;

import com.dm.shopb2b2c.crm.type.entity.JukeGoodsType;
import com.dm.shopb2b2c.crm.type.mapper.JukeGoodsTypeMapper;
import com.dm.shopb2b2c.crm.type.service.IJukeGoodsTypeService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * @Classname: JukeGoodsTypeServiceImpl
 * @Description： TODO
 * @Date: 2019/8/9 17:05
 * @Author: cyh
 */

@Service
public class JukeGoodsTypeServiceImpl implements IJukeGoodsTypeService {

    @Inject
    private JukeGoodsTypeMapper jukeGoodsTypeMapper;

    @Override
    public List<JukeGoodsType> getAllGoodsType() {
        return jukeGoodsTypeMapper.findAllType();
    }
}
