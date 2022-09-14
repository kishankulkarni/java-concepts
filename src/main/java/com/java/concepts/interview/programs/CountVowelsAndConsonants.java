package com.java.concepts.interview.programs;

import java.util.stream.IntStream;

public class CountVowelsAndConsonants {

    public static void main(String[] args) {
        String str = "kishan";
        Long vowels = IntStream.range(0, str.length())
                .filter(i -> Character.toString(str.charAt(i)).matches("[aeiou]"))
                .count();

        System.out.println("Vowels count:"+vowels+" Consonants count is:"+(str.length()-vowels));
    }
}
