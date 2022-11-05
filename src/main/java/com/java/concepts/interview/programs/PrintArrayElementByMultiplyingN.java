package com.java.concepts.interview.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintArrayElementByMultiplyingN {

    public static void main(String[] args) {
        int[] num ={1,2,3,4,5};

        Arrays.stream(num).forEach(i -> System.out.println(i*5));

        String str = "india is my country";
        str.replace(" ", "").chars()
                .mapToObj(i -> (char)i)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .forEach(m -> System.out.print(m.getKey()+":"+m.getValue()+" "));
        System.out.println("");

        //remove empty string from array
        String[] arr = {"abc", "", "def"};
        String[] newArr = Arrays.stream(arr)
                .filter(i -> !i.equals(""))
                .toArray(String[]::new);
        for (Object i : newArr){
            System.out.println(i);
        }

        //revere the element of array
        Arrays.stream(num)
                .mapToObj(i -> i)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::print);

    }
}
