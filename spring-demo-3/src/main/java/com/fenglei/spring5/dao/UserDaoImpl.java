package com.fenglei.spring5.dao;

import org.springframework.stereotype.Component;

/**
 * @author fenglei
 * @version 1.0
 * @description: TODO
 * @time 2021/10/8 10:13 上午
 */

@Component(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("userdao add....");
    }
}
