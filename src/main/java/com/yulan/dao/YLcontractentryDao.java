package com.yulan.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface YLcontractentryDao {
    List<Map<String,Object>> getYLcbyStateandmarketName(@Param("start")Integer start, @Param("number") Integer number);

    List<Map> getYLcBySate();

    int count();
}
