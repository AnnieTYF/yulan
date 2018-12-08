package com.yulan.controller;

import com.yulan.pojo.CustomerInfoCard;
import com.yulan.service.CustomerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("customerInfo")
public class CustomerInfoController {
    @Autowired
    private CustomerInfoService customerInfoService;

    /*
    *这里的CID应该是客户的loginName
     */
    @RequestMapping(value = "getCustomerInfo")
    @ResponseBody
    public CustomerInfoCard getCustomerInfo(@RequestParam("CID") String cID)throws Exception{
        System.out.println(customerInfoService.getCustomerInfo(cID));
        return customerInfoService.getCustomerInfo(cID);
    }

    /**
     * exchart显示资料卡执行汇总
     * @return
     */
    @RequestMapping("showStateEchart")
    @ResponseBody
    public Map<String, List<Object>> showStateEchart(){
        return customerInfoService.showStateEchart();
    }

    @RequestMapping("getAllSta")
    @ResponseBody
    public  Map<String,Object> getAllSta(@RequestParam(name = "limit", required = false) Integer limit,
                                         @RequestParam(name = "page", required = false) Integer page) throws UnsupportedEncodingException {
        if(limit==null||page==null) {
            page=null;
            limit=null;
        } else {
            page=(page-1)*limit+1;
        }
        int lastNum=page+limit-1;
        Map map = customerInfoService.getInfobyStateandmarketName(page,lastNum);
        map.put("code",0);
        map.put("msg","");
        return map;

    }



}
