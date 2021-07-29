package com.dukoia.cloud.service.impl;

import com.dukoia.cloud.entity.OrderDO;
import com.dukoia.cloud.mapper.OrderMapper;
import com.dukoia.cloud.service.OrderService;
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
public class OrderServiceImpl extends ServiceImpl<OrderMapper, OrderDO> implements OrderService {

}
