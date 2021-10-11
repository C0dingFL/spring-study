package com.fenglei.spring5.aopanno;

import org.springframework.stereotype.Component;

/**
 * @author fenglei
 * @version 1.0
 * @description: TODO
 * @time 2021/10/9 7:22 下午
 */
//被增强的类
@Component
public class User {
    public void add(){
        int i = 10/0;
        System.out.println("add ....");
    }
}
