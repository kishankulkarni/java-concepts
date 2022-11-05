package com.java.concepts.interview.programs;

import java.util.Arrays;

public class FindMagicNumber {

    // Convert the int to its String value
    // Get a stream of int that represents the ASCII value of each char(~digit) composing the
    // String version of our integer
    // To get the actual int value of a character, we have to subtract the ASCII code value of the
    // character '0' from the ASCII code of the actual character.
    // Convert the stream of int to an array of int using toArray()
    public static void main(String[] args) {
        int num = 163;
        int sum = Arrays.stream(
                Integer.toString(num)
                        .chars()
                        .map(c -> c-'0').toArray())
                .sum();
        if (sum == 10 || sum == 1) {
            System.out.println(num+" is a magic number");
        } else {
            System.out.println(num+" is not a magic number");
        }

    }
}
