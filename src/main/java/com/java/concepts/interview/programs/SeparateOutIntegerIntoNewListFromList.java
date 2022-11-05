package com.java.concepts.interview.programs;

import java.util.*;
import java.util.stream.Collectors;

public class SeparateOutIntegerIntoNewListFromList {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("as", "123", "32", "2as");
        Map<Boolean, List<String>> intList = list.stream()
                .collect(Collectors.partitioningBy(i -> i.matches("[0-9]*")));

        System.out.println(intList.get(true));

        int[] arr = {1, 34, 3, 98, 9, 76, 45, 4};
        Arrays.stream(Arrays.stream(arr)
                .mapToObj(i -> i + "")
                .collect(Collectors.joining())
                .split(""))
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::print);



    }
}
