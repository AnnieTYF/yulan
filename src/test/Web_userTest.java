
import com.yulan.dao.UserDao;
import com.yulan.dao.Web_userDao;
import com.yulan.utils.MD5;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class Web_userTest {
    @Autowired
    private Web_userDao web_userDao;

    @Test
    public void test1() {
        System.out.println(web_userDao.test("admin").getRealName());
        System.out.println(web_userDao.test("admin").getPassword());

    }
}