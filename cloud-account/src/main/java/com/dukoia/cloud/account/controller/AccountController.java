package com.dukoia.cloud.account.controller;

import com.dukoia.cloud.Result;
import com.dukoia.cloud.entity.ConfigInfoDO;
import com.dukoia.cloud.service.ConfigInfoService;
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
public class AccountController {

    @Autowired
    ConfigInfoService configInfoService;

    @GetMapping("/getAccount/{id}")
    public Result getAccount(@PathVariable("id") Long id){
        ConfigInfoDO byId = configInfoService.getById(1);
        return Result.success(byId);
    }
}
