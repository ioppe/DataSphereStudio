package com.webank.wedatasphere.dss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author wu
 */
@SpringBootApplication
public class PlatformIntegrationApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(PlatformIntegrationApplication.class, args);
        System.out.println("=========启动成功=========");
    }
}