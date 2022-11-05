package com.java.concepts.interview.programs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GreatestOfNegPostIntInArray {

    public static void main(String[] args) {
        int[] A = {3, 4, -3, -4, 5, -5};
        int[] B = IntStream.range(0, A.length)
                .map(i -> {
                    if (Integer.signum(A[i]) == -1) {
                        return -A[i];
                    }
                    return A[i];
                }).toArray();

        List<Integer> sortedList = Arrays.stream(B)
                .mapToObj(a -> a)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .filter(m -> m.getValue() == 2)
                .map(v -> -v.getKey())
                .collect(Collectors.toList());

        if (sortedList.size() != 0) {
            if (sortedList.size() == 1) {
                System.out.println(A[0]);
            } else {
                outerLoop:
                for (int i = 0; i < sortedList.size(); i++) {
                    for (int j = 0; j < A.length; j++ ) {
                        if (sortedList.contains(A[j]) && sortedList.get(i) >= A[j]) {
                            System.out.println(-A[j]);
                            break outerLoop;
                        }
                    }
                }

            }
        } else {
            System.out.println("0");
        }



    }
}
