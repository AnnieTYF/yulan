package com.yulan.dao;

import com.yulan.pojo.YLcontract_v2015;
import com.yulan.pojo.YLcontractentryShow;
import org.apache.ibatis.annotations.Param;

public interface YLcontractentryDao {

    YLcontract_v2015 getYLcontract_v2015(@Param("CCID") String ccid);

    boolean createYLcontract_v2015(YLcontract_v2015 yLcontract_v2015);

    YLcontractentryShow getYLcontractHTML(@Param("ID") Integer ID);

}
