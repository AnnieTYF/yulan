package com.yulan.dao;

import com.yulan.pojo.CustomerInfoCard;
import org.apache.ibatis.annotations.Param;

public interface CustomerInfoDao {

    CustomerInfoCard getCustomerInfo(@Param("CID") String cID);
}
