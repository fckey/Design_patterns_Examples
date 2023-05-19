package com.fckey.design.decorators;

import java.util.Base64;

/**
 * @version 1.0
 * @program: Design_patterns_Examples
 * @classname EncryptionDecorator
 * @description: None
 * @author: Jeff Fong
 * @create: 2023/05/19 10:37
 **/
public class EncryptionDecorator extends DataSourceDecorator{


    EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String encode(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    private String decode(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        return new String(result);
    }
}