package com.dukoia.cloud.gateway.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @Description: RedisUtils
 * @Author: jiangze.He
 * @Date: 2021-06-18
 * @Version: v1.0
 */
public class RedisUtils {

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 获取key 的过期时间
     * @param key
     * @return
     */
    public Long getTtl(String key){
        return redisTemplate.getExpire(key);
    }
}
