package com.java.concepts.interview.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindNthLargestNumber {
	// nth largest number
	static int n = 2;

	public static void main(String[] args) {
		usingStreams();
		withoutStreams();
	}

	public static void usingStreams() {
		List<Integer> list = Arrays.asList(1, 3, 5, 7, 3, 8);
		Optional<Integer> num = list.stream().distinct().sorted().skip(n - 1L).findFirst();
		if (num.isPresent()) {
			System.out.println(num.get());
		}
	}

	public static void withoutStreams() {
		int[] array = { 1, 3, 5, 7, 3, 8 };
		sortArray(array);
		int[] unique = removeDuplicate(array);
		System.out.println(unique[n - 1]);

	}

	public static int[] sortArray(int[] array) {
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	public static int[] removeDuplicate(int[] array) {
		int len = array.length;
		if (len == 0 || len == 1) {
			return array;
		}
		int[] temp = new int[len - 1];
		int j = 0;
		for (int i = 0; i < len - 1; i++) {
			if (array[i] != array[i + 1]) {
				temp[j++] = array[i];
			}
		}
		temp[j] = array[len - 1];
		return temp;
	}
}
