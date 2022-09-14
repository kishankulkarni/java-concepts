package com.java.concepts.interview.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedIntegerInArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,1,6,8,9};
        Optional<Integer> firstNonRepNum = Arrays.stream(arr)
                .mapToObj(i -> i)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(m -> m.getValue() == 1L)
                .map(Map.Entry::getKey)
                .findFirst();

        if (firstNonRepNum.isPresent()) {
            System.out.println(firstNonRepNum.get());
        } else {
            System.out.println("No unique integers found");
        }
    }
}
