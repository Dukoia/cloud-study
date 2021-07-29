package com.dukoia.cloud.service.impl;

import com.dukoia.cloud.entity.AccountDO;
import com.dukoia.cloud.mapper.AccountMapper;
import com.dukoia.cloud.service.AccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Dukoia
 * @since 2021-07-29
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, AccountDO> implements AccountService {

}
