package com.dukoia.cloud.account.fallback;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.dukoia.cloud.Result;
import org.springframework.stereotype.Component;

/**
 * @Description: AccountFallback
 * @Author: jiangze.He
 * @Date: 2021-07-29
 * @Version: v1.0
 */
@Component
public class AccountFallback {

    public static Result handler(Long id, BlockException exception){
        return Result.success("请求失败");
    }
}
