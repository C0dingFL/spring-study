package com.fenglei.spring.autowire;

/**
 * @author fenglei
 * @version 1.0
 * @description: TODO
 * @time 2021/10/7 9:49 下午
 */
public class Emp {

    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    public void test(){
        System.out.println(dept);
    }
}
