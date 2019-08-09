package com.dm.shopb2b2c.crm.type.mapper;

import com.dm.shopb2b2c.crm.type.entity.JukeGoodsType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Classname: JukeGoodsTypeMapper
 * @Description： TODO
 * @Date: 2019/8/9 17:04
 * @Author: cyh
 */
@Mapper
public interface JukeGoodsTypeMapper {

    //得到所有类别
    public List<JukeGoodsType> findAllType();
}
