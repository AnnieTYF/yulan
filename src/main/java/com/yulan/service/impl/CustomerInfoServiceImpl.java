package com.yulan.service.impl;

import com.yulan.dao.CustomerInfoDao;
import com.yulan.pojo.CustomerInfoCard;
import com.yulan.service.CustomerInfoService;
import com.yulan.utils.MapUtils;
import com.yulan.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 //           System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        return mapUtils.mapToBean(map ,CustomerInfoCard.class);
    }

    @Override
    public Map<String, Object> showStateEchart(String year) {
        String Y="全部年份";
        if (year!=null){
            Y=year;
        }
        List x=new ArrayList();
        List y=new ArrayList();
        Map<String,Object> map=new HashMap<>();
        List<Map> list=customerInfoDao.getInfoBySate(year);
        for(Map m:list){
            switch (m.get("STATE").toString()){
                case "ONCREATE":
                    y.add("初始状态");
                    x.add(m.get("NUMS"));
                    break;
                case "CUSTOMERPORCESSING":
                    y.add("客户填写中");
                    x.add(m.get("NUMS"));
                    break;
                case "CUSTOMERPORCESSING2":
                    y.add("客户修改中");
                    x.add(m.get("NUMS"));
                    break;
                case "BUSINESSCHECKING":
                    y.add("业务员审核中");
                    x.add(m.get("NUMS"));
                    break;
                case "APPROVED":
                    y.add("已通过");
                    x.add(m.get("NUMS"));
                    break;
                case "BIILDEPCHECKING":
                    y.add("订单部审核");
                    x.add(m.get("NUMS"));
                    break;
                default:break;
            }
        }
        map.put("textname",Y+"网签资料卡执行汇总");
        map.put("y",y);
        map.put("x",x);

        return map;
    }

    @Override
    public Map getInfobyStateandmarketName(Integer start, Integer number,String year) throws UnsupportedEncodingException {
        Map map=new HashMap<String,Object>(2);
        List<Map<String,Object>> list=customerInfoDao.getInfobyStateandmarketName(start,number,year);
        List<Map<String,Object>> list2=new ArrayList<>();
        for (Map<String,Object> m:list){
            if (m.get("MARKETNAME")!=null) {
                m.put("MARKETNAME", StringUtil.getUtf8(m.get("MARKETNAME").toString()));
            }
            if (m.get("SUBMARKETMANAGERNAME")!=null){
                m.put("SUBMARKETMANAGERNAME",StringUtil.getUtf8(m.get("SUBMARKETMANAGERNAME").toString()));
            }



            list2.add(m);
        }
        map.put("data",list2);
        map.put("count",customerInfoDao.count(year));
        return map;
    }


}
