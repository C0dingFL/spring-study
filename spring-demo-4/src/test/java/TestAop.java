import com.fenglei.spring5.aopanno.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fenglei
 * @version 1.0
 * @description: TODO
 * @time 2021/10/9 7:41 下午
 */
public class TestAop {
    @Test
    public void testAopAno(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
}
