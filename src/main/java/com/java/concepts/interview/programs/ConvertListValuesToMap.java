package com.java.concepts.interview.programs;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ConvertListValuesToMap {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a:1", "b:2", "c:3");

        Map<String, String> map = list.stream()
                .collect(Collectors.toMap(s -> s.split(":")[0], s -> s.split(":")[1]));

        System.out.println(map);
        List<Integer> ulist = List.of(1, 2, 4);
        ulist.add(5);
        System.out.println(ulist);
    }
}
