package com.yulan.service;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

public interface YLcontractentryService {
    Map<String, Object> showStateEchartYCl(String year);

    Map getYClbyStateandCID(Integer start,Integer number,String year) throws UnsupportedEncodingException;

    List<Map<String,Object>> getAllStates();


}
