package com.yulan.controller;

import com.yulan.pojo.YLcontract_v2015;
import com.yulan.service.YLcontractentryService;
import com.yulan.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.Map;

@Controller
@RequestMapping("YLcontractentry")
public class YLcontractentryController {
    @Autowired
    private YLcontractentryService yLcontractentryService;

    private YLcontract_v2015 yLcontract_v2015;

    private Response response;

    /**
     * 得到经销协议内容
     * @param data
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "getYLcontract")
    @ResponseBody
    public Map getYLcontract(@RequestBody Map<String,Object> data)throws IOException {
        String ccid = (String)data.get("ccid");
        yLcontract_v2015 = yLcontractentryService.getYLcontract_v2015(ccid);
        if(yLcontract_v2015 == null){
            return response.getResponseMap(1,"用户数据不存在" ,yLcontract_v2015);
        }else{
            return response.getResponseMap(0,"SUCCESS",yLcontract_v2015);
        }
    }

    /**
     * 创建协议书内容
     * @param yLcontract_v2015
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "createYLcontract")
    @ResponseBody
    public Map createYLcontract(@RequestBody YLcontract_v2015 yLcontract_v2015)throws IOException{
        System.out.println(yLcontract_v2015);
        if(yLcontractentryService.createYLcontract_v2015(yLcontract_v2015)){
            return response.getResponseMap(0,"SUCCESS",null);
        }else{
            return response.getResponseMap(1,"插入失败" ,null);
        }
    }

    /**
     * 获得协议书的HTML
     * @param data
     * @return
     */
    @RequestMapping(value = "getYLcontractHTML")
    @ResponseBody
    public Map getYLcontractHTML(@RequestBody Map<String,Object> data)throws IOException{
        String cid = (String)data.get("cid");
        String yLcontractHTML = yLcontractentryService.getYLcontractHTML(cid);
        if(yLcontractHTML.equals("") || yLcontractHTML == null){
            return response.getResponseMap(1,"没有相关协议书" ,null);
        }else{
            return response.getResponseMap(0,"SUCCESS" ,yLcontractHTML);
        }

    }

}
