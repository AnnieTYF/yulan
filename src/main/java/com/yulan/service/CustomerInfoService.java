package com.yulan.service;

import com.yulan.pojo.CustomerInfoCard;

import java.io.IOException;

public interface CustomerInfoService {

    CustomerInfoCard getCustomerInfo(String cID)throws IOException;

 //   boolean customer(String cID);
}
