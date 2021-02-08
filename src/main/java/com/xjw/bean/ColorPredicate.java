package com.xjw.bean;

public class ColorPredicate implements MyPredicate<Product> {

    private static final String RED = "red";

    @Override
    public boolean test(Product product) {
        return RED.equals(product.getColor());
    }
}
