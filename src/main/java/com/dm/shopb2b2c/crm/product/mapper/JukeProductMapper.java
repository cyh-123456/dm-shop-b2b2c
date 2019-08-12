package com.dm.shopb2b2c.crm.product.mapper;

import com.dm.shopb2b2c.crm.product.entity.JukeProduct;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Classname: JukeProductMapper
 * @Description： TODO
 * @Date: 2019/8/12 11:45
 * @Author: cyh
 */
@Mapper
public interface JukeProductMapper {

    public List<JukeProduct> findJukeProduct();
}
