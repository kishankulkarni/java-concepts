package com.java.concepts.interview.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindEvenNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 2);
		usingStream(list);
		withoutStream(list);
	}

	public static void usingStream(List<Integer> list) {
		Set<Integer> evenNum = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toSet());
		System.out.println(evenNum);
	}

	public static void withoutStream(List<Integer> list) {
		Set<Integer> uniqueNum = new HashSet<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				uniqueNum.add(list.get(i));
			}
		}
		System.out.print(uniqueNum);
	}

}