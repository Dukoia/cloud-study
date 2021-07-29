package com.dukoia.cloud.account;

import com.alibaba.cloud.sentinel.SentinelProperties;
import com.alibaba.csp.sentinel.adapter.servlet.CommonFilter;
import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import javax.servlet.Filter;

/**
 * @Description: com.dukoia.cloud.account.CloudAccountApplication
 * @Author: jiangze.He
 * @Date: 2021-06-25
 * @Version: v1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages= {"com.dukoia.cloud"})
@MapperScan(basePackages = {"com.dukoia.cloud.mapper"})
public class CloudAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudAccountApplication.class);
    }

    @Bean
    public FilterRegistrationBean sentinelFilterRegistration() {
        FilterRegistrationBean<Filter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new CommonFilter());
        registration.addUrlPatterns("/*");
        registration.setName("sentinelFilter");
        registration.setOrder(1);

        return registration;
    }

    // 注解支持的配置Bean
    @Bean
    public SentinelResourceAspect sentinelResourceAspect() {
        return new SentinelResourceAspect();
    }

}
