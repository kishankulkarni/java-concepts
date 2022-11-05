package com.java.concepts.interview.programs;

public class ReverseNumberAndAddItToGetPalindrome {

    public static void main(String[] args)
    {
        ReverseandAdd(195l);
    }

    static long reversDigits(long num)
    {
        long rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }

    static boolean isPalindrome(long num)
    {
        return (reversDigits(num) == num);
    }

    static void ReverseandAdd(long num)
    {
        long rev_num = 0;
        while (num <= 4294967295l) {
            rev_num = reversDigits(num);
            num = num + rev_num;

            if (isPalindrome(num)) {
                System.out.println(num);
                break;
            }
            else if (num > 4294967295l) {
                System.out.println("No palindrome exist");
            }
        }
    }
}
