package com.dm.shopb2b2c.crm.typeAndBrand.mapper;

import com.dm.shopb2b2c.crm.typeAndBrand.entity.JukeTypeAndBrand;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Classname: JukeTypeAndBrandMapper
 * @Description： TODO
 * @Date: 2019/8/13 14:29
 * @Author: cyh
 */
@Mapper
public interface JukeTypeAndBrandMapper {
    public List<JukeTypeAndBrand> findAllTypeAndBrand();

}
