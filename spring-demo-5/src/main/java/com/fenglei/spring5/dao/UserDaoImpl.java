package com.fenglei.spring5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author fenglei
 * @version 1.0
 * @description: TODO
 * @time 2021/10/11 9:43 上午
 */

@Repository
public class UserDaoImpl implements UserDao{
    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //lucy 转账 100 给 mary
    @Override
    public void reduceMoney() {
        String sql = "update t_account set money=money-? where username=?";
        jdbcTemplate.update(sql,100,"lucy");
    }

    @Override
    public void addMoney() {
        String sql = "update t_account set money=money+? where username=?";
        jdbcTemplate.update(sql,100,"mary");
    }

}
