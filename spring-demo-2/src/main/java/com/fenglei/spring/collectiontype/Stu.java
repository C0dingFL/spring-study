package com.fenglei.spring.collectiontype;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author fenglei
 * @version 1.0
 * @description: TODO xml注入集合属性
 * @time 2021/10/7 5:10 下午
 */
public class Stu {
    private String[] courses;
    private List<String> list;
    private Map<String,String> maps;
    private Set<String> sets;

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }
}
