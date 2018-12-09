package com.yulan.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface YLcontractentryDao {
    List<Map<String,Object>> getYLcbyStateandCID(@Param("start")Integer start, @Param("number") Integer number,@Param("year")String year);

    List<Map> getYLcBySate(@Param("year")String year);

    String getArea_code(String CID);//关联customer

    String getAreaName(String area_code);//关联Area_code

    String getCenter_mangerId(@Param("area_code")String area_code);//关联Area_owner

    String getName(String owner);//HES_EMPLOYEE

    int count(@Param("year")String year);
}
