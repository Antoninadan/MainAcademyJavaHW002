package com.mainacad.service;

public class NumberService {
    public static Integer getSumDigitalsByIntegerDivision(int number){
        Integer result = 0;
        while(number > 1) {
            result += number%10;
            number = number%10;
        }

        return result;  // int result, unboxing
    }

//    public Integer getSumDigitalsByTypeManipulation(int number){
//        Integer result = 0;
//
//        String numbertAsString = String.valueOf(number);
//        // "12345" -> {'1', '2'...}
//        char[] symbols = numbertAsString.toCharArray();
//
//        for (int i = 0; i < symbols.length; i++) {
//            result = result + symbols[i].; /////
//        }
//
//
//        for (char symbol:symbols) {
//            result += symbol;
//        }
//
//        int i =0;
//        while(i< symbols.length) {
//            result = result + symbols[i];
//            i++;
//        }
//
//        i = 0;
//        do{
//            result = result + symbols[i];
//            i++;
//        } while (i< symbols.length);
//
//
//        return result;
//    }

}
