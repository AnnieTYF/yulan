package com.yulan.service;

import java.util.Map;

public interface WebcontractwfmemberService {
    //获取每年权限-审核人员
    Map getebcontractwfmemberbyYear(String year,Integer start,Integer number);
}
