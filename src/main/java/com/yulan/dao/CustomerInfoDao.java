package com.yulan.dao;

import com.yulan.pojo.CustomerInfoCard;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CustomerInfoDao {

    CustomerInfoCard getCustomerInfo(@Param("CID") String cID);

    List<Map<String,Object>> getInfobyStateandmarketName(@Param("start")Integer start, @Param("number") Integer number,@Param("year")String year);

    List<Map> getInfoBySate(@Param("year")String year);

    int count(@Param("year")String year);

    List<CustomerInfoCard> getAllinfo(@Param("start")Integer start, @Param("number") Integer number,
                                      @Param("year")String year,@Param("state")String state,
                                      @Param("find")String find);

    int countInfo(@Param("year")String year,@Param("state")String state,
                  @Param("find")String find);

    List<Map<String,Object>> getAllStates();


}
