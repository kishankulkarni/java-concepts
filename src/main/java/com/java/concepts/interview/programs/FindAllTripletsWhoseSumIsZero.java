package com.java.concepts.interview.programs;

import java.util.Arrays;
import java.util.List;

public class FindAllTripletsWhoseSumIsZero {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1,2,5,-3,8,-7,-2);

        for(int i = 0; i < num.size(); i++) {
            for(int j = i+1; j < num.size(); j++) {
                for(int q = j+1; q < num.size(); q++) {
                    int sum = num.get(i)+num.get(j)+num.get(q);
                    if(sum == 0){
                        System.out.println("Triplets whose sum is 0 are "+num.get(i)+","+num.get(j)+","+num.get(q));

                    }
                }
            }
        }
    }
}
