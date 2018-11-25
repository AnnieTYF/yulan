package com.yulan.controller;


import com.yulan.service.WebcontractwfmemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping(value="webcontractwfmember")
public class WebcontractwfmemberController {
    @Autowired
    private WebcontractwfmemberService webcontractwfmemberService;

    @RequestMapping("getWebcontractwfmembers")
    @ResponseBody
    public Map<String,Object> getAdmins(@RequestParam(name = "limit", required = false) Integer limit,
                                        @RequestParam(name = "page", required = false) Integer page,
                                        @RequestParam(name="year",required = false) String name) {
        if(limit==null||page==null) {
            page=null;
            limit=null;
        } else {
            page=(page-1)*limit;
        }
        Map map = webcontractwfmemberService.getebcontractwfmemberbyYear(name,page,limit);
        map.put("code",0);
        map.put("msg","");
        return map;
    }

}
