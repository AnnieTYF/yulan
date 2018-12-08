package com.yulan.service;

import com.yulan.pojo.CustomerInfoCard;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

public interface CustomerInfoService {

    CustomerInfoCard getCustomerInfo(String cID)throws IOException;

    Map<String, List<Object>> showStateEchart();

    Map getInfobyStateandmarketName(Integer start,Integer number) throws UnsupportedEncodingException;
}
