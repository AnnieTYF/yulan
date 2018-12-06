package com.yulan.service.impl;

import com.yulan.dao.CustomerInfoDao;
import com.yulan.pojo.CustomerInfoCard;
import com.yulan.service.CustomerInfoService;
import com.yulan.utils.MapUtils;
import com.yulan.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
public class CustomerInfoServiceImpl implements CustomerInfoService {
    @Autowired
    private CustomerInfoDao customerInfoDao;

    private CustomerInfoCard customerInfoCard;

    private StringUtil stringUtil;

    private static MapUtils mapUtils;

    @Override
    public CustomerInfoCard getCustomerInfo(String cID) throws IOException {
        customerInfoCard = customerInfoDao.getCustomerInfo(cID);
        Map<String, Object> map = new HashMap<String, Object>();
        map = mapUtils.beanToMap(customerInfoCard);

        for (Map.Entry<String,Object> entry : map.entrySet()) {
            if(entry.getValue() instanceof String){
                String origin = stringUtil.getUtf8(String.valueOf(entry.getValue()));
                entry.setValue(origin);
            }
         System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

       mapUtils.mapToBean(map,CustomerInfoCard.class);
        return mapUtils.mapToBean(map,CustomerInfoCard.class);
    }
}
