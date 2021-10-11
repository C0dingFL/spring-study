package com.fenglei.spring5.entity;

import org.springframework.stereotype.Component;

/**
 * @author fenglei
 * @version 1.0
 * @description: TODO
 * @time 2021/10/11 9:40 上午
 */
@Component
public class Account {
    private Integer id;
    private String username;
    private int money;

    public Account() {
    }

    public Account(Integer id, String username, int money) {
        this.id = id;
        this.username = username;
        this.money = money;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", money=" + money +
                '}';
    }
}
