package com.java.concepts.interview.programs;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseAString {

    public static void main(String[] args) {
        String str = "kishan";
        int len  = str.length() - 1;
        String reverse = IntStream.range(0, str.length())
                .map(i -> len - i)
                .mapToObj(j -> str.charAt(j))
                .map(s -> s.toString())
                .collect(Collectors.joining());

        System.out.println(reverse);
        reverseString(str);
    }

    static void reverseString(String str){
        if (str == null || str.length() == 1) {
            System.out.print(str);
        } else {
            System.out.print(str.charAt(str.length() - 1));
            reverseString(str.substring(0, str.length() - 1));
        }
    }
}
