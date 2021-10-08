import com.fenglei.spring.autowire.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fenglei
 * @version 1.0
 * @description: TODO
 * @time 2021/10/7 9:56 下午
 */
public class TestSpringDemo2 {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
        System.out.println(emp);
        emp.test();
    }
}
