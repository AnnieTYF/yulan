import com.yulan.utils.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserTest {
    @Test
    public void test1() {
        List<Object> parameters = new ArrayList<>();
        parameters.add("cc");
        parameters.add("dd");
        parameters.add("ee");
        System.out.println(StringUtil.replace("aaabaaabaaabaaa","aaa",parameters));
    }
}