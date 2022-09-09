package com.java.concepts.threads;

public class CreateThreadByImplRunnable implements Runnable {
	
	public static void main(String[] args) {
		CreateThreadByImplRunnable thread =  new CreateThreadByImplRunnable();
		Thread t = new Thread(thread);
		t.start();
	}

	@Override
	public void run() {
		System.out.println("Thread created by implementing RUNNABLE INTERFACE!!!");
	}

}
