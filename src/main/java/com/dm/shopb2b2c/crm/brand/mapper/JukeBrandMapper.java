package com.dm.shopb2b2c.crm.brand.mapper;

import com.dm.shopb2b2c.crm.brand.entity.JukeBrand;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Classname: JukeBrandMapper
 * @Description： TODO
 * @Date: 2019/8/8 19:21
 * @Author: cyh
 */
@Mapper
public interface JukeBrandMapper {
    public List<JukeBrand> findJukeAll();
}
