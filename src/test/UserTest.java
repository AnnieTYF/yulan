
import com.yulan.dao.UserDao;
import com.yulan.utils.MD5;
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

    @Test
    public void test1() {
        System.out.println(userDao.getUser("CIN001"));
        System.out.println(MD5.toMD5("yulan1234"));
    }

}
