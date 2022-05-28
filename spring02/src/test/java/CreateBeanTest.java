import com.li.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description:
 * @author: lll
 * @date: 2022-05-21 12:13
 */



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:spring/business-config.xml"})
public class CreateBeanTest {

    @Autowired
    StringRedisTemplate redisTemplate;

    @Autowired
    User user;


    @Test
    public void test() {
        System.out.println(user);
    }


    @Test
    public void redistTest() {
//        redisTemplate.opsForValue().set("name","lihua");
        String value = redisTemplate.opsForValue().get("name");
        System.out.println(value);

    }
}
