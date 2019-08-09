package com.dm.shopb2b2c.crm.brand.service.impl;

import com.dm.shopb2b2c.crm.brand.mapper.JukeBrandMapper;
import com.dm.shopb2b2c.crm.brand.entity.JukeBrand;
import com.dm.shopb2b2c.crm.brand.service.IJukeBrandService;
import org.minbox.framework.api.boot.plugin.datasource.annotation.DataSourceSwitch;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * @Classname: JukeBrandService
 * @Description： TODO
 * @Date: 2019/8/9 9:39
 * @Author: cyh
 */
@Service
@DataSourceSwitch("juke")
public class JukeBrandServiceImpl implements IJukeBrandService {

    @Inject
    private JukeBrandMapper jukeBrandMapper;

    @Override
    public List<JukeBrand> findJukeAll(){
        return  jukeBrandMapper.findJukeAll();
    }
}
