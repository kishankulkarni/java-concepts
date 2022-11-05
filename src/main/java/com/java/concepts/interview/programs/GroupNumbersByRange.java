package com.java.concepts.interview.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupNumbersByRange {

    public static void main(String[] args) {
        int[] arr = {2, 34, 54, 23, 33, 30, 59, 11, 19, 37};
        Map<Integer, List<Integer>> grpNum = Arrays.stream(arr)
                .mapToObj(i -> i)
                .collect(Collectors.groupingBy(num -> num / 10 * 10));

        System.out.println(grpNum);
    }
}
