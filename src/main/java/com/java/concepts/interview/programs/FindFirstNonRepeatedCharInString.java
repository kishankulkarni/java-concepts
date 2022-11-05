package com.java.concepts.interview.programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedCharInString {

	public static void main(String[] args) {
		String str = "Javja vteste";
		usingStream(str);
		withoutStream(str);
	}

	private static void usingStream(String str) {
		Optional<Character> res = str.replace(" ", "").chars().mapToObj(s -> Character.toLowerCase((char) s))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(c -> c.getValue() == 1L).map(Entry::getKey).findFirst();

		if (res.isPresent()) {
			System.out.println(res.get());
		} else {
			System.out.println("No unique characters in String!!!");
		}
	}

	private static void withoutStream(String str) {
		Map<Character, Integer> charCount = new LinkedHashMap<>();
		String trimmedStr = str.replace(" ", "");
		for (int i = 0; i < trimmedStr.length(); i++) {
			charCount.put(trimmedStr.toLowerCase().charAt(i),
					charCount.containsKey(trimmedStr.charAt(i)) ? charCount.get(trimmedStr.charAt(i)) + 1 : 1);
		}
		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}
	}
}
