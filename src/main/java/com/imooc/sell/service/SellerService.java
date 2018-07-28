package com.imooc.sell.service;

import com.imooc.sell.dataobject.SellerInfo;

public interface SellerService {
    /**
     * search seller's information
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
