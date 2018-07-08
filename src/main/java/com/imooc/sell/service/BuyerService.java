package com.imooc.sell.service;

//买家

import com.imooc.sell.dto.OrderDTO;
import org.aspectj.weaver.ast.Or;

public interface BuyerService {
    //用orderid查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);
    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
