package com.java.concepts.interview.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfSquareOfEvenNumber {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        int sum = list.stream()
                .filter(num -> num%2 == 0)
                .map(i -> i*i)
                .mapToInt(Integer::intValue)
                .sum();

//        int sum = list.stream()
//                .filter(num -> num%2 == 0)
//                .map(i -> i*i)
//                .collect(Collectors.summingInt(Integer::intValue));

        System.out.println(sum);
    }
}
