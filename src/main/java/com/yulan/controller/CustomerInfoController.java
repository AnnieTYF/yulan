package com.yulan.controller;

import com.yulan.pojo.CustomerInfoCard;
import com.yulan.service.CustomerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
