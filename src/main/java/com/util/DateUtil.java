package com.util;

import com.xjw.bean.Product;

public class DateUtil {

    public static Product product = new Product();
    static {
        System.out.println("静态块");
    }
}
