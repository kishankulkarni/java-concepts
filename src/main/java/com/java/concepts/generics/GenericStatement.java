package com.java.concepts.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericStatement {

	public static void main(String[] args) {

		//without generics
		List names1 = new ArrayList();
		names1.add("A");
		String s1 = (String) names1.get(0);
		System.out.println(s1);
		
		//with generics
		List<String> names2 = new ArrayList<>();
		names2.add("B");
		String s2 =  names2.get(0); // casting is not required
		System.out.println(s2);
	}

}
