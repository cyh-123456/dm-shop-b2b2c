package com.dm.shopb2b2c;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.wf.jwtp.configuration.EnableJwtPermission;


@EnableCaching
@EnableJwtPermission
@SpringBootApplication
//@ComponentScan(basePackages = { "net.shopec.util", "net.shopec", "com.dm.shopb2b2c" })
@EnableTransactionManagement
@MapperScan(basePackages = {"mapper"})
public class ShopB2b2cApplication {

    public static void main(String[] args) {
        //spring boot 集成redis和elasticsearch遇到的坑 https://blog.csdn.net/sinat_29899265/article/details/81772037
        System.setProperty("es.set.netty.runtime.available.processors","false");
        SpringApplication.run(ShopB2b2cApplication.class, args);
    }



}
