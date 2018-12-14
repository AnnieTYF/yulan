package com.yulan.service;

import com.yulan.pojo.CustomerInfoCard;

import java.io.IOException;

public interface CustomerInfoService {

    //获取客户资料卡
    CustomerInfoCard getCustomerInfo(String cID)throws IOException;

 //   boolean customer(String cID);
    // 更新客户资料卡
    boolean updateCustomerInfo(CustomerInfoCard customerInfoCard);
}
