package com.java.concepts.threads;

public class CreateThreadByExtThread extends Thread {

	public static void main(String[] args) {
		CreateThreadByExtThread thread = new CreateThreadByExtThread();
		thread.start();
	}
	
	public void run() {
		System.out.println("Thread Created by extending the THREAD CLASS!!!");
	}

}
