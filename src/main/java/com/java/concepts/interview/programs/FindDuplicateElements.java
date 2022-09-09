package com.java.concepts.interview.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElements {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 1, 5, 6, 3);
		usingStream(list);
		withoutStream(list);
	}

	public static void withoutStream(List<Integer> list) {
		Map<Integer, Integer> dupNumCount = new HashMap<>();
		System.out.println("");
		for (int i = 0; i < list.size(); i++) {
			dupNumCount.put(list.get(i), dupNumCount.containsKey(list.get(i)) ? dupNumCount.get(list.get(i))+1 : 1);
		}

		for (Map.Entry<Integer, Integer> entry : dupNumCount.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.print(entry.getKey()+"="+entry.getValue()+" ");
			}
		}
	}

	public static void usingStream(List<Integer> list) {
		list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(m -> m.getValue() > 1).forEach(k -> System.out.print(k.getKey() + "=" + k.getValue() + " "));
	}
}
