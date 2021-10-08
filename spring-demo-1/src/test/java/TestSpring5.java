import com.fenglei.spring.Book;
import com.fenglei.spring.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fenglei
 * @version 1.0
 * @description: TODO
 * @time 2021/10/7 10:15 上午
 */
public class TestSpring5 {


    @Test
    public void testBook1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book", Book.class);
        book.test();
    }
    @Test
    public void testAdd(){
        //1.加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }


}
