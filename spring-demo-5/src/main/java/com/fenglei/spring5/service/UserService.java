package com.fenglei.spring5.service;

import com.fenglei.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author fenglei
 * @version 1.0
 * @description: TODO
 * @time 2021/10/11 9:45 上午
 */
//@Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.REPEATABLE_READ)


@Service
public class UserService {
    //注入Dao
    @Autowired
    private UserDao userDao;

    public void accountMoney(){
        //lucy少100
        userDao.reduceMoney();

        //模拟异常
//        int i = 10 / 0;

        //Mary多100
        userDao.addMoney();
    }
}
