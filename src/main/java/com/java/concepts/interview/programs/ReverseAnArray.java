package com.java.concepts.interview.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class ReverseAnArray {

    public static void main(String[] args) {
        int[] arr = {0,8,3,4,5};
        int len = arr.length - 1;
        Integer[] rev = IntStream.range(0, arr.length)
                .map(i -> len - i)
                .mapToObj(j -> arr[j])
                .toArray(Integer[]::new);

        for (int i : rev) {
            System.out.print(i);
        }
    }
}
