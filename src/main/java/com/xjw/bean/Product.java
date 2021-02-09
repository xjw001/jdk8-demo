package com.xjw.bean;

import lombok.Data;


@Data
public class Product {

    private String color;

    public Product(String color) {
        this.color = color;
    }
    public Product(){
        System.out.println("构造方法");
        this.color = "red";
    }
}
