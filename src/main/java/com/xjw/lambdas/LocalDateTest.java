package com.xjw.lambdas;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {

    @Test
    public void test01() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("格式化前:" + localDateTime);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        String format = localDateTime.format(dateTimeFormatter);
        System.out.println("格式化后:" + format);
    }
}
