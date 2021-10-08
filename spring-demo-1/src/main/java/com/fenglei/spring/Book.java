package com.fenglei.spring;

/**
 * @author fenglei
 * @version 1.0
 * @description: TODO 使用set方法进行注入属性
 * @time 2021/10/7 3:50 下午
 */
public class Book {

    //创建属性
    private String bname;
    private String bauthor;

    //创建属性对应的 set 方法
    public void setBname(String bname) {
        this.bname = bname;
    }
    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void test(){
        System.out.println("bname = " + bname + ", bauthor = " + bauthor);
    }


}
