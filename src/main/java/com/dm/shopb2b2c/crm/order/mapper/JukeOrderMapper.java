package com.dm.shopb2b2c.crm.order.mapper;

import com.dm.shopb2b2c.crm.order.entity.JukeOrder;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Classname: JukeOrderMapper
 * @Description： TODO
 * @Date: 2019/8/15 16:31
 * @Author: cyh
 */
@Mapper
public interface JukeOrderMapper {

    public void addJukeOrder(JukeOrder jukeOrder);
}
