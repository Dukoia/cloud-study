package com.dukoia.cloud.account;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description: com.dukoia.cloud.account.CloudAccountApplication
 * @Author: jiangze.He
 * @Date: 2021-06-25
 * @Version: v1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages= {"com.dukoia.cloud"})
@MapperScan(basePackages = {"com.dukoia.cloud"})
public class CloudAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudAccountApplication.class);
    }
}
