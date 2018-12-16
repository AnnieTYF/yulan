package com.yulan.service.impl;

import com.yulan.dao.YLcontractentryDao;
import com.yulan.pojo.CustomerInfoCard;
import com.yulan.pojo.YLcontract_v2015;
import com.yulan.pojo.YLcontractentry;
import com.yulan.service.CustomerInfoService;
import com.yulan.service.YLcontractentryService;
import com.yulan.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class YLcontractentryServiceImpl implements YLcontractentryService {
    @Autowired
    private YLcontractentryDao yLcontractentryDao;

    private YLcontract_v2015 yLcontract_v2015;

    private YLcontractentry yLcontractentry;
    @Autowired
    private CustomerInfoService customerInfoService;

    private CustomerInfoCard customerInfoCard;

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

    /**
     * 一共需要三张表的数据，并且这些数据要按照一定的顺序排列
     * CustomerInfoCard YLCONTRACT_V2015 YLCONTRACTENTRY
     * @param cid
     * @return
     */
    @Override
    public String getYLcontractHTML(String cid) throws IOException{
        List<Object> list = new ArrayList<Object>();
        /*
        CustomerInfoCard
        cname
        X_POST_ADDRESS
        X_DISTRICT、X_AREA_DISTRICT_2、X_AREA_DISTRICT_3
        preferedbrand
        account1Name //公司开户名
        account2Name //个人开户名
        account1Bank //公司银行
        account2Name
        account1 银行账号
        account2
        account1Location
        account2Location
          */
        customerInfoCard = customerInfoService.getCustomerInfo(cid);
        System.out.println("123" +customerInfoCard);
        /*
        YLCONTRACTENTRY
        startDate
        endDate
         */
         yLcontractentry = yLcontractentryDao.getYLcontractentry(cid);
         System.out.println("123" +yLcontractentry);
        /*
        YLCONTRACT_V2015
        总任务 = 玉兰+尚居
        A_RETAILING 玉兰
        C_MATCHING 尚居
        M1
        M2
        M3
        M4
        M5
        M6
        M7
        M8
        M9
        M10
        M11
        M12
        TOTAL = M1+...+M12
        REWORDPERCENT 总返点比例
        REWORDPERCENT2兰居返点
        STOCKPERCENT备货比例
        人名币 = 总任务 * 备货比例
        PRIVATE_ACCOUNT_AUTHED 客户授权配偶账号
        */
        yLcontract_v2015 = getYLcontract_v2015(cid);
        System.out.println("123" + yLcontract_v2015);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Double total = (yLcontract_v2015.getM1()+yLcontract_v2015.getM2()+yLcontract_v2015.getM3()+yLcontract_v2015.getM4()+yLcontract_v2015.getM5()
                +yLcontract_v2015.getM6()+yLcontract_v2015.getM7()+yLcontract_v2015.getM8()+yLcontract_v2015.getM9()
                +yLcontract_v2015.getM10()+yLcontract_v2015.getM11()+yLcontract_v2015.getM12());
        list.add(customerInfoCard.getCname());
        list.add(customerInfoCard.getxPostAddress());
        list.add(customerInfoService.getXDistrict(customerInfoCard.getxDistrict()));
        list.add(customerInfoService.getXAreaDistrictName(customerInfoCard.getxAreaDistrict2()));
        list.add(customerInfoService.getXAreaDistrictName(customerInfoCard.getxAreaDistrict3()));
        list.add(sdf.format(yLcontractentry.getStartDate()));
        list.add(sdf.format(yLcontractentry.getEndDate()));
        list.add(customerInfoCard.getPreferedbrand());
        list.add(Double.toString(yLcontract_v2015.getaRetailing() + yLcontract_v2015.getcMatching()));
        list.add(Double.toString(yLcontract_v2015.getaRetailing()));
        list.add(Double.toString(yLcontract_v2015.getcMatching()));
        list.add(Double.toString(yLcontract_v2015.getM1()));
        list.add(Double.toString(yLcontract_v2015.getM2()));
        list.add(Double.toString(yLcontract_v2015.getM3()));
        list.add(Double.toString(yLcontract_v2015.getM4()));
        list.add(Double.toString(yLcontract_v2015.getM5()));
        list.add(Double.toString(yLcontract_v2015.getM6()));
        list.add(Double.toString(yLcontract_v2015.getM7()));
        list.add(Double.toString(yLcontract_v2015.getM8()));
        list.add(Double.toString(yLcontract_v2015.getM9()));
        list.add(Double.toString(yLcontract_v2015.getM10()));
        list.add(Double.toString(yLcontract_v2015.getM11()));
        list.add(Double.toString(yLcontract_v2015.getM12()));
        list.add(Double.toString(total));
        list.add(Double.toString(yLcontract_v2015.getRewordpercent()));
        list.add(Double.toString(yLcontract_v2015.getRewordpercent2()));
        list.add(Double.toString(yLcontract_v2015.getStockpercent()));
        list.add(Double.toString(yLcontract_v2015.getStockpercent() * total));
        list.add(customerInfoCard.getAccount1Name());
        list.add(customerInfoCard.getAccount2Name());
        list.add(customerInfoCard.getAccount1Bank());
        list.add(customerInfoCard.getAccount2Bank());
        list.add(customerInfoCard.getAccount1());
        list.add(customerInfoCard.getAccount2());
        list.add(customerInfoCard.getAccount1Location());
        list.add(customerInfoCard.getAccount2Location());
        list.add(yLcontract_v2015.getPrivateAccountAuthed());

        System.out.println(yLcontractentryDao.getYLcontractHTML(1).getTest());
        String test = yLcontractentryDao.getYLcontractHTML(1).getTest();
        test = StringUtil.getUtf8(test);

        String html = stringUtil.replace(test,"AAAA",list);

        return html;
    }
}
