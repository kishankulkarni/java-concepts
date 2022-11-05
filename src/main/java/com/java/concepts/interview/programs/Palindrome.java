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
        
        int num = 121;
        integerPalindrome(num);
    }

    private static void integerPalindrome(int num) {

        int reversedNum = 0, remainder;

        // store the number to originalNum
        int originalNum = num;

        // get the reverse of originalNum
        // store it in variable
        while (num != 0) {
            remainder = num % 10;
            if(Integer.signum(remainder) == -1 ) {
                break;
            }
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        // check if reversedNum and originalNum are equal
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is Palindrome.");
        }
        else {
            System.out.println(originalNum + " is not Palindrome.");
        }
    }
}
