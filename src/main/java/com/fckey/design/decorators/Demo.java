package com.fckey.design.decorators;

/**
 * @version 1.0
 * @program: Design_patterns_Examples
 * @classname Demo
 * @description: None
 * @author: Jeff Fong
 * @create: 2023/05/19 10:40
 **/
public class Demo {
    public static void main(String[] args) {
        String salaryRecords = "Name,age\nfckey ,999\njeff fong,2100";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("../OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("../OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}