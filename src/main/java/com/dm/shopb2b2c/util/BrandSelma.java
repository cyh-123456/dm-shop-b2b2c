package com.dm.shopb2b2c.util;

import com.dm.shopb2b2c.crm.brand.entity.JukeBrand;
import com.dm.shopb2b2c.shopec.brand.entity.ShopBrand;
import fr.xebia.extras.selma.Field;
import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.Mapper;

/**
 * @Classname: BrandSelma
 * @Description： TODO
 * @Date: 2019/8/9 10:27
 * @Author: cyh
 */

@Mapper(withCyclicMapping = true,withIgnoreMissing = IgnoreMissing.ALL,withCustomFields =
        {
                @Field({"brandId","ShopBrand.brand_id"}),
                @Field({"name","ShopBrand.name"}),
                @Field({"sort","orders"}),
        }
)
public interface BrandSelma {

    ShopBrand JukeToShop(JukeBrand jukeBrand);

}
