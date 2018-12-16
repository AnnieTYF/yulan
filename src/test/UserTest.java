import com.yulan.dao.CustomerInfoDao;
import com.yulan.dao.UserDao;
import com.yulan.dao.YLcontractentryDao;
import com.yulan.pojo.CustomerInfoCard;
import com.yulan.pojo.YLcontract_v2015_paa;
import com.yulan.service.CustomerInfoService;
import com.yulan.service.YLcontractentryService;
import com.yulan.utils.MapUtils;
import com.yulan.utils.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserTest {
    @Autowired
    private UserDao userDao;
    @Autowired
    private CustomerInfoDao customerInfoDao;
    @Autowired
    private CustomerInfoService customerInfoService;
    @Autowired
    private YLcontractentryDao yLcontractentryDao;

    private CustomerInfoCard customerInfoCard;

    private MapUtils mapUtils;

    private StringUtil stringUtil;

    private YLcontract_v2015_paa yLcontract_v2015_paa;
    @Autowired
    private YLcontractentryService yLcontractentryService;

    @Test
    public void test1() throws Exception{
        CustomerInfoCard customerInfoCard= new CustomerInfoCard();
        /*if (customerInfoDao.updateCustomerInfo()){
            System.out.println("ok");
        }*/


//        customerInfoCard = customerInfoService.getCustomerInfo("C15056");
        /*Map<String, Object> map = new HashMap<String, Object>();
        map = mapUtils.beanToMap(customerInfoCard);

        for (Map.Entry<String,Object> entry : map.entrySet()) {
            if(entry.getValue() instanceof String){
                String origin = stringUtil.getUtf8(String.valueOf(entry.getValue()));
                entry.setValue(stringUtil.setUtf8(origin));
            }
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

        }

        System.out.println("23333"+mapUtils.mapToBean(map ,customerInfoCard));*/
  //      System.out.println(customerInfoService.getCustomerInfo("123"));
  //      System.out.println(customerInfoDao.getCustomerInfo("C15093"));
 //       System.out.println(customerInfoDao.getCustomerInfo( "C15056"));
        //System.out.println(MD5.toMD5("yulan1234"));
 //       System.out.println(customerInfoCard);
//        System.out.println(customerInfoService.getYLcontract("123"));
 //       System.out.println(customerInfoDao.getXAreaDistrictName("D1805"));
        //System.out.println(customerInfoDao.getYLcontract("C06030"));*/
 //    yLcontract_v2015_paa = new YLcontract_v2015_paa(2020,"123","张三","邮政储蓄银行");
  //    System.out.println(customerInfoService.createYLcontract(yLcontract_v2015_paa));
    //    System.out.println(yLcontractentryDao.getYLcontract_v2015("C12020"));
 //       System.out.println(yLcontractentryDao.getYLcontractHTML(1));
        System.out.println(yLcontractentryService.getYLcontractHTML("C15056"));
    }

}
