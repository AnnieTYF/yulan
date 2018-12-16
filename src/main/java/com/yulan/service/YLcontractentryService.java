package com.yulan.service;

import com.yulan.pojo.YLcontract_v2015;

import java.io.IOException;

public interface YLcontractentryService {

    YLcontract_v2015 getYLcontract_v2015(String ccid)throws IOException;

    boolean createYLcontract_v2015(YLcontract_v2015 yLcontract_v2015)throws IOException;
}
