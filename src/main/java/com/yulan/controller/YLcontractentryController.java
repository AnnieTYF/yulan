package com.yulan.controller;

import com.yulan.service.YLcontractentryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("YLcontractentry")
public class YLcontractentryController {
    @Autowired
    private YLcontractentryService yLcontractentryService;

    /**
     * exchart显示资料卡执行汇总
     * @return
     */
    @RequestMapping("showEchart")
    @ResponseBody
    public Map<String, Object> showEchart(@RequestParam("year")String year){
        if (year.equals("")){
            year=null;
        }
        return yLcontractentryService.showStateEchartYCl(year);
    }

    @RequestMapping("getAllSta")
    @ResponseBody
    public  Map<String,Object> getAllSta(@RequestParam(name = "limit", required = false) Integer limit,
                                         @RequestParam(name = "page", required = false) Integer page,
                                         @RequestParam("year")String year) throws UnsupportedEncodingException {
        if (year.equals("")){
            year=null;
        }
        if(limit==null||page==null) {
            page=null;
            limit=null;
        } else {
            page=(page-1)*limit+1;
        }
        int lastNum=page+limit-1;
        Map map = yLcontractentryService.getYClbyStateandCID(page,lastNum,year);
        map.put("code",0);
        map.put("msg","");
        return map;

    }

    @RequestMapping("getAllSates")
    @ResponseBody
    public List<Map<String,Object>> getAllStates(){
        return yLcontractentryService.getAllStates();
    }
}
