package com.mainacad;

import com.mainacad.service.NumberService;

public class ApplicationRunner {
    public static void main(String[] args) {
        int number = 989889;
        System.out.println("Test Integer division for number " + number + ": sum of digits = "
                + NumberService.getSumDigitalsByIntegerDivision(number));
        System.out.println("Test Type manipulation for number " + number + ": sum of digits = "
                + NumberService.getSumDigitalsByTypeManipulation(number));
    }
}
