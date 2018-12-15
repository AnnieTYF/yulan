package com.yulan.controller;

import com.yulan.pojo.CustomerInfoCard;
import com.yulan.pojo.YLcontract_v2015_paa;
import com.yulan.service.CustomerInfoService;
import com.yulan.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.Map;

@Controller
@RequestMapping("customerInfo")
public class CustomerInfoController {
    @Autowired
    private CustomerInfoService customerInfoService;

    private Response response;

    /**
     * 里的CID应该是客户的loginName
     * 读取客户资料卡
     * @param data
     * @return
     * @throws Exception
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

    /**
     * 更新客户资料卡
     * @param customerInfoCard
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "updateCustomerInfo")
    @ResponseBody
    public Map updateCustomerInfo(@RequestBody CustomerInfoCard customerInfoCard)throws Exception{
        System.out.println(customerInfoCard);
        if(customerInfoService.updateCustomerInfo(customerInfoCard)){
            return Response.getResponseMap(0,"更新成功",null);
        }else{
            return Response.getResponseMap(1,"更新失败",null);
        }
    }

    /**
     * 得到委托授权书
     * @param data
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "getYLcontract")
    @ResponseBody
    public Map getYLcontract(@RequestBody Map<String,Object> data)throws IOException {
        String ccID = (String)data.get("CCID");
        if(customerInfoService.getYLcontract(ccID) == null){
            return response.getResponseMap(1,"用户数据不存在" ,customerInfoService.getYLcontract(ccID));
        }else{
            return response.getResponseMap(0,"SUCCESS" ,customerInfoService.getYLcontract(ccID));
        }
    }

    @RequestMapping(value = "createYLcontract")
    @ResponseBody
    public Map createYLcontract(@RequestBody YLcontract_v2015_paa yLcontract_v2015_paa)throws IOException{
        if(customerInfoService.createYLcontract(yLcontract_v2015_paa)){
            return Response.getResponseMap(0,"创建成功",null);
        }else{
            return Response.getResponseMap(1,"创建失败",null);
        }
    }

    /*
    上传照片
     */
}