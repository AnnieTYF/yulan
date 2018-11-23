package com.yulan.dao;

import com.yulan.pojo.Web_user;
import org.apache.ibatis.annotations.Param;

public interface Web_userDao {
    Web_user test(String loginName);

    //登陆
    Web_user login(@Param("loginName")String loginName,@Param("password")String password);
}
