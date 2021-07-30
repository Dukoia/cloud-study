package com.dukoia.cloud.account.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.dukoia.cloud.Result;
import com.dukoia.cloud.account.fallback.AccountFallback;
import com.dukoia.cloud.entity.ConfigInfoDO;
import com.dukoia.cloud.service.ConfigInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: AccountController
 * @Author: jiangze.He
 * @Date: 2021-06-25
 * @Version: v1.0
 */
@RestController
@Slf4j
public class AccountController {

    @Autowired
    ConfigInfoService configInfoService;

    @GetMapping("/getAccount/{id}")
    @SentinelResource(value = "accountFallback",
            blockHandlerClass = AccountFallback.class,
            blockHandler = "handler")
    public Result getAccount(@PathVariable("id") Long id) {
        ConfigInfoDO byId = configInfoService.getById(1);
        return Result.success("byId");
    }
}
