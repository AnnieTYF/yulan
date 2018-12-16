package com.yulan.service;

import com.yulan.pojo.CustomerInfoCard;
import com.yulan.pojo.YLcontract_v2015_paa;

import java.io.IOException;

public interface CustomerInfoService {

    //获取客户资料卡
    CustomerInfoCard getCustomerInfo(String cID)throws IOException;
    //获取委托书
    YLcontract_v2015_paa getYLcontract(String cCID) throws IOException;

 //   boolean customer(String cID);
    // 更新客户资料卡
    boolean updateCustomerInfo(CustomerInfoCard customerInfoCard)throws IOException;

    boolean createYLcontract(YLcontract_v2015_paa yLcontract_v2015_paa) throws IOException;

    String getXAreaDistrictName(String getXAreaDistrict3Name)throws IOException;

    String getXDistrict(String xDistrict)throws IOException;
}
