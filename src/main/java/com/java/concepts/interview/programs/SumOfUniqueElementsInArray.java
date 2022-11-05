package com.java.concepts.interview.programs;

import java.util.Arrays;

public class SumOfUniqueElementsInArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4};
        int sum = Arrays.stream(arr).distinct().sum();
        System.out.println(sum);

    }
}
