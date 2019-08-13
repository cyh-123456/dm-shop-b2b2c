package com.dm.shopb2b2c.crm.typeAndBrand.service.impl;

import com.dm.shopb2b2c.crm.typeAndBrand.entity.JukeTypeAndBrand;
import com.dm.shopb2b2c.crm.typeAndBrand.mapper.JukeTypeAndBrandMapper;
import com.dm.shopb2b2c.crm.typeAndBrand.service.IJukeTypeAndBrandService;
import org.minbox.framework.api.boot.plugin.datasource.annotation.DataSourceSwitch;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * @Classname: IJukeTypeAndBrandServiceImpl
 * @Description： TODO
 * @Date: 2019/8/13 14:34
 * @Author: cyh
 */
@Service
@DataSourceSwitch("juke")
public class IJukeTypeAndBrandServiceImpl implements IJukeTypeAndBrandService {

    @Inject
    private JukeTypeAndBrandMapper jukeTypeAndBrandMapper;

    @Override
    public List<JukeTypeAndBrand> findAll(){
        return jukeTypeAndBrandMapper.findAllTypeAndBrand();
    }
}
