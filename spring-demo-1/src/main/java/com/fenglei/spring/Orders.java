package com.fenglei.spring;

/**
 * @author fenglei
 * @version 1.0
 * @description: TODO
 * @time 2021/10/7 4:02 下午
 */
public class Orders {

    private String oname;
    private String address;
    //带参构造方法
    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }
}
