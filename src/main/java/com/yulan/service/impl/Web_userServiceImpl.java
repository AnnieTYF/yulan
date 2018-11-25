package com.yulan.service.impl;

import com.yulan.dao.Web_userDao;
import com.yulan.pojo.Web_user;
import com.yulan.service.Web_userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Web_userServiceImpl implements Web_userService {
    @Autowired
    private Web_userDao web_userDao;

    @Override
    public Web_user login(String loginName, String password) {

        return web_userDao.login(loginName,password);
    }
}
