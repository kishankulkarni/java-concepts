package com.java.concepts.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {

	static Character[] charArray= {'a','b'};
	static Integer[] intArray= {1,2};
	
	//non generic method which can give class cast exception
//	public static List arrayToList(Object[] array, List<Object> list) {
//		for(Object object : array) {
//			list.add(object);
//		}
//		return list;
//	}
	
	// generic method
	public static <T> List<T> arrayToList(T[] array, List<T> list) {
		for(T object : array) {
			list.add(object);
		}
		return list;
	}
	
	public static void main(String[] args) {
		List<Character> charList = arrayToList(charArray, new ArrayList<>());
		List<Integer> intList = arrayToList(intArray, new ArrayList<>());
		System.out.println(intList.get(0)); // this causes java.lang.ClassCastException when we do not use generic method
	}
	

	
}
