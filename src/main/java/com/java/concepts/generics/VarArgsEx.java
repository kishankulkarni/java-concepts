package com.java.concepts.generics;

public class VarArgsEx {

	public static void main(String[] args) {
		String item1 = "car";
		String item2 = "bus";
		String[] cart = {"book","laptop"};

//		printShoppingItems(cart);
		printShoppingItems(item1, item2);
		printShoppingItems("book", "laptop");
	}
	
	// the below method takes n no. of items
	private static void printShoppingItems(String ... items) {
		System.out.println("Shopping Items using varargs");
		for(int i =0; i < items.length; i++) {
			System.out.println(items[i]);
		}
	}
	
	//the below methods are without varargs. hence takes specific no. of arg
//	private static void printShoppingItems(String[] cart) {
//		System.out.println("Shopping cart");
//		for(int i =0; i < cart.length; i++) {
//			System.out.println(cart[i]);
//		}
//		
//	}

//	private static void printShoppingItems(String item1, String item2) {
//		System.out.println("Shopping Items");
//		System.out.println(item1);
//		System.out.println(item2);
//	}

}
