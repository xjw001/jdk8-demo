package com.xjw.lambdas;

import com.xjw.bean.ColorPredicate;
import com.xjw.bean.MyPredicate;
import com.xjw.bean.Product;
import org.junit.Test;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lbdtest2 {

    public static void main(String[] args) {
        List<Product> resList = new ArrayList<Product>();
        new Lbdtest2().filterProductByColor(resList, p -> p.getColor().equals("red"));
    }

    public List<Product> filterProductByColor(List<Product> list, MyPredicate<Product> myPredicate) {
        List<Product> resList = new ArrayList<Product>();
        for (Product product : list) {
            if (myPredicate.test(product)) {
                resList.add(product);
            }
        }
        return resList;
    }

    @Test
    public void test03() {
        // NPE
        Optional<Product> op2 = Optional.ofNullable(null);
        System.out.println(op2);
    }

    @Test
    public void test02() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Integer count = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println(count);
    }

    @Test
    public void test01() {
        List s = new ArrayList();
        Stream stream = s.stream();
        Stream stream1 = stream.map(new Function<String, Map>() {
            @Override
            public Map apply(String s) {
                return null;
            }
        });
    }


}
