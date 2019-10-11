package com.mainacad;

import com.mainacad.service.NumberService;

public class ApplicationRunner {
    public static void main(String[] args) {
        int number = 123;
//        System.out.println("for number: " + number + " sum of digits = " + NumberService.getSumDigitalsByIntegerDivision(number));

        System.out.println(number %10);

        System.out.println(number%100);

        System.out.println(number%1000);


    }
}
