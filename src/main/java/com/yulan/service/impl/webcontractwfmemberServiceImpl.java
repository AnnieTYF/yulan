package com.yulan.service.impl;

import com.yulan.dao.WebcontractwfmemberDao;
import com.yulan.service.WebcontractwfmemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class webcontractwfmemberServiceImpl implements WebcontractwfmemberService {
    @Autowired
    private WebcontractwfmemberDao webcontractwfmemberDao;

    @Override
    public Map getebcontractwfmemberbyYear(String year,Integer start,Integer number) {
        Map map=new HashMap<String,Object>(2);
        map.put("data",webcontractwfmemberDao.getAllwebcontractwfmemberbyyear(year,start,number));
        map.put("count",webcontractwfmemberDao.count(year));
        return  map;

    }
}
