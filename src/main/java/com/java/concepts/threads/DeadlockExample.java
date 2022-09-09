package com.java.concepts.threads;

public class DeadlockExample {

	public static Object spoon = new Object();
	public static Object bowl = new Object();
	
	public static void main(String[] args) {
		
		Thread cook1 = new Thread(() -> {
			synchronized (spoon) {
				System.out.println("cook1: holding spoon...");
				System.out.println("cook1: waiting for bowl...");
			}
			
			synchronized (bowl) {
				System.out.println("cook1: holding spoon and bowl...");
			}
		});
		
		Thread cook2 = new Thread(() -> {
			synchronized (bowl) {
				System.out.println("cook2: holding bowl...");
				System.out.println("cook2: waiting for spoon...");
			}
			
			synchronized (spoon) {
				System.out.println("cook2: holding spoon and bowl...");
			}
		});
		cook1.start();
		cook2.start();
	}

}
