package com.java.concepts.interview.programs;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseAString {

    public static void main(String[] args) {
        String str = "kishan";
        String reverse = IntStream.range(0, str.length())
                .map(i -> str.length() - 1 - i)
                .mapToObj(j -> str.charAt(j))
                .map(s -> s.toString())
                .collect(Collectors.joining());

        System.out.println(reverse);
    }
}
