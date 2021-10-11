import com.fenglei.spring5.service.UserService;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author fenglei
 * @version 1.0
 * @description: TODO
 * @time 2021/10/11 8:20 下午
 */
//@RunWith(SpringJUnit4ClassRunner.class)//单元测试框架
//@ContextConfiguration("classpath:bean.xml")//加载配置文件
    @SpringJUnitConfig(locations = "classpath:bean.xml")
public class JTest4 {
    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        userService.accountMoney();
    }
}
