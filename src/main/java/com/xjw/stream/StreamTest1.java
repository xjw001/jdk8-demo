package com.xjw.stream;

import org.junit.Test;

import javax.annotation.PreDestroy;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamTest1 {

    public static void main(String[] args) {
        Stream.generate(()->Math.random()).limit(5).forEach(System.out::println);
    }


    @Test
    public void handle01(){
        List list = Arrays.asList("zhangsan","lisi","abc","hehehehehehe");
        //List xx = filterItem(list,x -> x.length()>5);
        String concat = concat(() -> "aaa");
        System.out.println(concat);
    }

    public static List<String> filterItem(List<String> list, Predicate<String> pre){
        List listx = new ArrayList();
        for (String  item: list) {
            if(pre.test(item)){
                listx.add(item);
            }
        }
        return listx;
    }

    public static String concat(Supplier<String> supplier){
        String str = supplier.get();
        return  str;
    }

}
