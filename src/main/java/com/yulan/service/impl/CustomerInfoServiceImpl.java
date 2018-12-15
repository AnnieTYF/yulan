package com.yulan.service.impl;

import com.yulan.dao.CustomerInfoDao;
import com.yulan.pojo.CustomerInfoCard;
import com.yulan.pojo.YLcontract_v2015_paa;
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

    private YLcontract_v2015_paa yLcontract_v2015_paa;

    private StringUtil stringUtil;

    private static MapUtils mapUtils;

    @Override
    public CustomerInfoCard getCustomerInfo(String cID) throws IOException {
        if(customerInfoDao.getCustomerInfo(cID) == null){
            return null;
        }else{
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
            return mapUtils.mapToBean(map,CustomerInfoCard.class);
        }

    }

    @Override
    public YLcontract_v2015_paa getYLcontract(String cCID) throws  IOException{
        if(customerInfoDao.getYLcontract(cCID)== null){
            System.out.println("123");
            return null;
        }else{
            System.out.println("321");
            yLcontract_v2015_paa = customerInfoDao.getYLcontract(cCID);
            Map<String, Object> map = new HashMap<String, Object>();
            map = mapUtils.beanToMap(yLcontract_v2015_paa);

            for (Map.Entry<String,Object> entry : map.entrySet()) {
                if(entry.getValue() instanceof String){
                    String origin = stringUtil.getUtf8(String.valueOf(entry.getValue()));
                    entry.setValue(origin);
                }
                System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            }
            return mapUtils.mapToBean(map,YLcontract_v2015_paa.class);
        }
    }

    @Override
    public boolean updateCustomerInfo(CustomerInfoCard customerInfoCard) throws IOException{
        Map<String, Object> map = new HashMap<String, Object>();
        map = mapUtils.beanToMap(customerInfoCard);

        for (Map.Entry<String,Object> entry : map.entrySet()) {
            if(entry.getValue() instanceof String){
                String origin = stringUtil.setUtf8(String.valueOf(entry.getValue()));
                entry.setValue(origin);
                System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            }

        }

        customerInfoCard = mapUtils.mapToBean(map,CustomerInfoCard.class);

        return customerInfoDao.updateCustomerInfo(customerInfoCard);
    }

    @Override
    public boolean createYLcontract(YLcontract_v2015_paa yLcontract_v2015_paa) throws IOException {
        Map<String, Object> map = new HashMap<String, Object>();
        map = mapUtils.beanToMap(yLcontract_v2015_paa);

        for (Map.Entry<String,Object> entry : map.entrySet()) {
            if(entry.getValue() instanceof String){
                String origin = stringUtil.setUtf8(String.valueOf(entry.getValue()));
                entry.setValue(origin);
                System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            }
        }

        yLcontract_v2015_paa = mapUtils.mapToBean(map,YLcontract_v2015_paa.class);
        return customerInfoDao.insertYLcontract(yLcontract_v2015_paa);
    }
}
