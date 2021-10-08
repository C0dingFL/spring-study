package com.fenglei.spring5.service;

import com.fenglei.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author fenglei
 * @version 1.0
 * @description: TODO
 * @time 2021/10/8 9:48 上午
 */

//value默认是首字母小写的类名称

@Component(value = "userService") // value相当于bean中的id
public class UserService {
    //定义 dao 类型属性
    // 不需要添加 set 方法
    // 添加注入属性注解
    @Autowired //根据类型进行注入
    @Qualifier(value = "userDaoImpl1") //根据名称注入
    private UserDao userDao;

    public void add(){
        System.out.println("service add ......");
        userDao.add();
    }
}
