package com.mainacad.service;

public class NumberService {
    public static Integer getSumDigitalsByIntegerDivision(int number) {
        Integer result = 0;
        while (number > 0) {
            result += number % 10;
            number = number / 10;
        }
        return result;
    }

    public static Integer getSumDigitalsByTypeManipulation(int number) {
        Integer result = 0;
        String numbertAsString = String.valueOf(number);
        // "12345" -> {'1', '2'...}
        char[] symbols = numbertAsString.toCharArray();
        for (char symbol : symbols) {
            result = result + Character.getNumericValue(symbol);
        }
        return result;
    }

}
