package com.java.concepts.interview.programs;

import java.util.ArrayList;
import java.util.List;

public class FindConsecutiveSequenceNum {

    public static void main(String[] args) {
        String input = "1 2 3 5 9 a 6 7 8 4 @ -5 -7 -3 -2 -1";
        String[] splitInput = input.split(" ");
        List<Integer> sequence = new ArrayList<>();
        List<List<Integer>> sequences = new ArrayList<>();
        Integer previous = null;
        for (String s : splitInput) {
            try {
                Integer current = Integer.parseInt(s);

                if (previous != null) {
                    if ((current - previous) == 1) {
                        sequence.add(current);
                    } else {

                        if (sequence.size() > 1) {
                            sequences.add(sequence);
                        }
                        sequence = new ArrayList<>();
                        sequence.add(current);
                    }
                    previous = current;
                } else {
                    previous = current;
                    sequence.add(current);
                }
            } catch (NumberFormatException e) {
                if (sequence.size() > 1) {
                    sequences.add(sequence);
                }
                previous = null;
                sequence = new ArrayList<>();
            }
        }
        if (sequence.size() > 1) {
            sequences.add(sequence);
        }
        sequences.stream().forEach(System.out::print);
    }
}
