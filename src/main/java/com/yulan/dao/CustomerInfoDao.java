package com.yulan.dao;

import com.yulan.pojo.CustomerInfoCard;
import com.yulan.pojo.YLcontract_v2015_paa;
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

    /**
     *
     * @param cCID
     * @return
     */
   YLcontract_v2015_paa getYLcontract(@Param("CCID") String cCID);

    /**
     *
     * @param yLcontract_v2015_paa
     * @return
     */
   boolean insertYLcontract(YLcontract_v2015_paa yLcontract_v2015_paa);

}
