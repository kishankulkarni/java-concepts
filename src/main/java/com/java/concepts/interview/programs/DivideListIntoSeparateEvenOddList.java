package com.java.concepts.interview.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DivideListIntoSeparateEvenOddList {

    //Use the partitioningBy collector. It collects the stream into a map, which has 2 lists. One list contains elements
    // that satisfy the predicate, the other contains those that don't.
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> evenOddElements = list.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));
        System.out.println("List having even number: "+ evenOddElements.get(true));
        System.out.println("List having odd number: "+ evenOddElements.get(false));


    }
}
