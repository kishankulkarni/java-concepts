package com.java.concepts.interview.programs;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Palindrome {

    public static void main(String[] args) {
        String str = "aKa";
        boolean isPalindrome = IntStream.range(0, str.length())
                .map(i -> str.length() - 1 - i)
                .mapToObj(j -> str.charAt(j))
                .map(s -> s.toString().toLowerCase())
                .collect(Collectors.joining())
                .matches(str.toLowerCase());

        if (isPalindrome) {
            System.out.println(str+" is a palindrome");
        } else {
            System.out.println(str+" is not a palindrome");
        }
    }
}
