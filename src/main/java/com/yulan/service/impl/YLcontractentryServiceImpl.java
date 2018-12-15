package com.yulan.service.impl;

import com.yulan.dao.YLcontractentryDao;
import com.yulan.service.YLcontractentryService;
import com.yulan.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class YLcontractentryServiceImpl implements YLcontractentryService {
    @Autowired
    private YLcontractentryDao yLcontractentryDao;

    @Override
    public Map<String, Object> showStateEchartYCl(String year) {
        String Y="全部年份";
        if (year!=null){
            Y=year;
        }
        List x=new ArrayList();
        List y=new ArrayList();
        Map<String,Object> map=new HashMap<>();
        List<Map> list=yLcontractentryDao.getYLcBySate(year);
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
                case "CUSTOMERAFFIRM":
                    y.add("客户查看确认中");
                    x.add(m.get("NUMS"));
                    break;
                case "CSA_CHECK":
                    y.add("销售副总批准中");
                    x.add(m.get("NUMS"));
                    break;
                case "DEP_MARKET_CHECK":
                    y.add("市场部审核中");
                    x.add(m.get("NUMS"));
                    break;
                case "SALEMANFILLING":
                    y.add("业务员填写中");
                    x.add(m.get("NUMS"));
                    break;
                case "ASM_CHECKING":
                    y.add("销售中心经理审核中");
                    x.add(m.get("NUMS"));
                    break;
                default:break;
            }
        }
        map.put("textname",Y+"协议网签执行汇总");
        map.put("y",y);
        map.put("x",x);

        return map;

    }

    @Override
    public Map getYClbyStateandCID(Integer start, Integer number,String year) throws UnsupportedEncodingException {
        Map map=new HashMap<String,Object>(2);
        List<Map<String,Object>> list=yLcontractentryDao.getYLcbyStateandCID(start,number,year);
        List<Map<String,Object>> list2=new ArrayList<>();
        for (Map<String,Object> m:list){
            String area_code=yLcontractentryDao.getArea_code(m.get("CID").toString());
            String area_name=yLcontractentryDao.getAreaName(area_code);
            m.put("MARKETNAME", StringUtil.getUtf8(area_name));
            String owner=yLcontractentryDao.getCenter_mangerId(area_code);
            String managerName=yLcontractentryDao.getName(owner);
            m.put("SUBMARKETMANAGERNAME",StringUtil.getUtf8(managerName));
            list2.add(m);
        }
        map.put("data",list2);
        map.put("count",yLcontractentryDao.count(year));

        return map;
    }
}
