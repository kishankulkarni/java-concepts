package com.java.concepts.interview.programs;

import java.util.stream.Stream;

public class FibonacciEx {

    public static void main(String[] args) {
        int n = 10;
        printFibonnaciWithoutStream(n);
        printFibonnaciUsingStreams(n);
    }

    public static void printFibonnaciWithoutStream(int n) {
        int num1 = 0;
        int num2 = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(num1 + " ");
            int temp = num2 + num1;
            num1 = num2;
            num2 = temp;
        }
    }

    public static void printFibonnaciUsingStreams(int n) {
        System.out.println();
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]}).limit(n).map(t -> t[0])
                .forEach(t -> System.out.print(t + " "));
    }
}
