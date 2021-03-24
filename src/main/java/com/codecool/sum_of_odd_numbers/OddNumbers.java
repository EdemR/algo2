package com.codecool.sum_of_odd_numbers;

import java.util.List;

public class OddNumbers {

    public static Integer sum(List<Integer> numbers) {
        Integer result = 0;

        for (Integer num : numbers) {
            if (num % 2 == 1 || num % 2 == -1) {
                result += num;
            }
        }

        return result;
    }
}