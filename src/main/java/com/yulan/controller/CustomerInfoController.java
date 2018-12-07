package com.yulan.controller;

import com.yulan.pojo.CustomerInfoCard;
import com.yulan.service.CustomerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("customerInfo")
public class CustomerInfoController {
    @Autowired
    private CustomerInfoService customerInfoService;

    /*
    *这里的CID应该是客户的loginName
     */
    @RequestMapping(value = "getCustomerInfo"  , method = RequestMethod.POST )
    @ResponseBody
    public CustomerInfoCard getCustomerInfo(@RequestBody Map<String,Object> data)throws Exception{
        String cID = (String) data.get("CID");
        System.out.println(customerInfoService.getCustomerInfo(cID));
        return customerInfoService.getCustomerInfo(cID);
    }
}
