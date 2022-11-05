package com.java.concepts.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("B", 29, null, null));
        list.add(new Student("A", 30, null, null));
        list.stream().sorted(Comparator.comparing(Student::getAge).reversed()).forEach(System.out::print);
        int age = list.stream().max(Comparator.comparing(Student::getAge)).get().getAge();

        System.out.println(age);


        int n = 94321;
        int sum = 0;

        // Loop to do sum while
        // sum is not less than
        // or equal to 9
        while (n > 0 || sum > 9)
        {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);


    }
}
