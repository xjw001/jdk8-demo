package com.xjw.lambdas;

import java.util.Comparator;
import java.util.TreeSet;

public class LbdTest {

    public static void main(String[] args) {

        //匿名内部类
        Comparator<Integer> cpt = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };

        TreeSet<Integer> set = new TreeSet<>(cpt);
        Comparator<Integer> cpt2 = (x, y) -> Integer.compare(x, y);

        TreeSet<Integer> set2 = new TreeSet<>(cpt2);
    }
}
