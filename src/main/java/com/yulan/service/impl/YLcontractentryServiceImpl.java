package com.yulan.service.impl;

import com.yulan.dao.YLcontractentryDao;
import com.yulan.pojo.YLcontract_v2015;
import com.yulan.service.YLcontractentryService;
import com.yulan.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class YLcontractentryServiceImpl implements YLcontractentryService {
    @Autowired
    private YLcontractentryDao yLcontractentryDao;

    private YLcontract_v2015 yLcontract_v2015;

    private StringUtil stringUtil;

    @Override
    public YLcontract_v2015 getYLcontract_v2015(String ccid) throws IOException {
        if(yLcontractentryDao.getYLcontract_v2015(ccid) == null){
            return null;
        }else{
            yLcontract_v2015 = yLcontractentryDao.getYLcontract_v2015(ccid);
            String preferedbrand = stringUtil.getUtf8(yLcontract_v2015.getPreferedbrand());
            yLcontract_v2015.setPreferedbrand(preferedbrand);
            return yLcontract_v2015;
        }

    }

    @Override
    public boolean createYLcontract_v2015(YLcontract_v2015 yLcontract_v2015) throws IOException {
        yLcontract_v2015.setPreferedbrand(stringUtil.setUtf8(yLcontract_v2015.getPreferedbrand()));
        return yLcontractentryDao.createYLcontract_v2015(yLcontract_v2015);
    }
}
