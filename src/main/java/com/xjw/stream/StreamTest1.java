package com.xjw.stream;

import com.util.DateUtil;
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
    static {
        System.out.println("xxx");
    }

    public static void main(String[] args) {
        System.out.println("1--"+ DateUtil.product);

        System.out.println("2--");
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
