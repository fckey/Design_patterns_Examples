package com.fangshaolei.design.prototype.test1;

import java.io.Serializable;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Citation
 * @Description
 * @createTime 2022/05/29 8:13
 **/
public class Citation implements Cloneable, Serializable {
    // 三好学生上的姓名
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
    private People people;

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public void show(){
        System.out.println(this.people.getName() + " 获得了证书");
    }

    // 重写clone方法
    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }


}
