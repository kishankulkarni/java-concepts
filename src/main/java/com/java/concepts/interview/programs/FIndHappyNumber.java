package com.java.concepts.interview.programs;

public class FIndHappyNumber {

    public static void main(String[] args) {
        int n = 1111111;
        System.out.println(findSum(n));
    }

    private static int findSum(int n) {
        int sum  = 0;
        while(n != 0) {
            int rem = n%10;
            sum += Math.pow(rem, 2);
            n = n/10;
        }
        if (sum == 1) {
            return sum;
        } else if (sum < 7) {
            return sum;
        } else {
            return findSum(sum);
        }
    }
}
