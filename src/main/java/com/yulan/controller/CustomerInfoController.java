package com.yulan.controller;

import com.yulan.pojo.CustomerInfoCard;
import com.yulan.service.CustomerInfoService;
import com.yulan.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("customerInfo")
public class CustomerInfoController {
    @Autowired
    private CustomerInfoService customerInfoService;

    private Response response;

    /*
    *这里的CID应该是客户的loginName
    * 读取客户资料卡
     */
    @RequestMapping(value = "getCustomerInfo")
    @ResponseBody
    public Map getCustomerInfo(@RequestBody Map<String,Object> data)throws Exception{
       String cID = (String)data.get("CID");
        System.out.println(cID);
        if(customerInfoService.getCustomerInfo(cID) == null){
            return response.getResponseMap(1,"用户数据不存在" ,customerInfoService.getCustomerInfo(cID));
        }else{
            return response.getResponseMap(0,"SUCCESS" ,customerInfoService.getCustomerInfo(cID));

        }
    }

    /*
    更新客户资料卡
     */
    @RequestMapping(value = "updateCustomerInfo")
    @ResponseBody
    public Map updateCustomerInfo(@RequestBody CustomerInfoCard customerInfoCard){
        System.out.println(customerInfoCard);
        if(customerInfoService.updateCustomerInfo(customerInfoCard)){
            return Response.getResponseMap(0,"更新成功",null);
        }else{
            return Response.getResponseMap(1,"更新失败",null);
        }
    }

    /*
    上传照片
     */
}
