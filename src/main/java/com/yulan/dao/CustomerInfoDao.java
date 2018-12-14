package com.yulan.dao;

import com.yulan.pojo.CustomerInfoCard;
import org.apache.ibatis.annotations.Param;

public interface CustomerInfoDao {

    /**
     *
     * @param cID
     * @return
     */
    CustomerInfoCard getCustomerInfo(@Param("CID") String cID);

    /**
     *
     * @param customerInfoCard
     * @return
     */
   boolean updateCustomerInfo(CustomerInfoCard customerInfoCard);

}
