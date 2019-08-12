package com.dm.shopb2b2c.crm.product.service.impl;

import com.dm.shopb2b2c.crm.product.entity.JukeProduct;
import com.dm.shopb2b2c.crm.product.mapper.JukeProductMapper;
import com.dm.shopb2b2c.crm.product.service.IJukeProductService;
import org.minbox.framework.api.boot.plugin.datasource.annotation.DataSourceSwitch;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * @Classname: JukeProductServiceImpl
 * @Description： TODO
 * @Date: 2019/8/12 11:46
 * @Author: cyh
 */
@Service
@DataSourceSwitch("juke")
public class JukeProductServiceImpl implements IJukeProductService {

    @Inject
    private JukeProductMapper jukeProductMapper;

    @Override
    public List<JukeProduct> getJukeProduct() {
        return jukeProductMapper.findJukeProduct();
    }
}
