package com.fangshaolei.design.prototype.test;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName CitationTest
 * @Description
 * @createTime 2022/05/29 8:15
 **/
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 1. 创建原型对象
        Citation citation1 = new Citation();
        // 2. 创建一个people对象
        People people = new People();
        people.setName("zhangsan");
        citation1.setPeople(people);

        // 2. 克隆证书
        Citation citation2 = citation1.clone();
        citation2.getPeople().setName("fangshaolei ");
//        citation1.setName("fangsl");
//        citation2.setName("wangwu");
        // 3. 使用show方法进行展示
        citation1.show();
        citation2.show();
    }
}
