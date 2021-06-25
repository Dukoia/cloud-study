package com.dukoia.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @Description: com.dukoia.cloud.gateway.CloudGatewayApplication
 * @Author: jiangze.He
 * @Date: 2021-06-25
 * @Version: v1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayApplication.class, args);
    }

}
