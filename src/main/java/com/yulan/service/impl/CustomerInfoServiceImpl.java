package com.yulan.service.impl;

import com.yulan.dao.CustomerInfoDao;
import com.yulan.pojo.CustomerInfoCard;
import com.yulan.service.CustomerInfoService;
import com.yulan.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class CustomerInfoServiceImpl implements CustomerInfoService {
    @Autowired
    private CustomerInfoDao customerInfoDao;

    private CustomerInfoCard customerInfoCard;

    private StringUtil stringUtil;

    @Override
    public CustomerInfoCard getCustomerInfo(String cID) throws IOException {
        customerInfoCard = customerInfoDao.getCustomerInfo(cID);
        stringUtil.getUtf8(customerInfoCard.getxDistrict());
        /*
        这里还没有转换
         */
        return customerInfoDao.getCustomerInfo(cID);
    }
}
