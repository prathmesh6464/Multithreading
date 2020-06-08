package com.bridz.multithreading.thread_join;

class MyThread extends Thread {
	public void run() {
		System.out.println("My thread is in running state.");
	}
}

public class MultithreadingJoin{

	public static void main(String args[]) {

		MyThread myThread = new MyThread();
		myThread.start();
		try {
			myThread.join();
		} catch (InterruptedException e) {
		}
		System.out.println("Thread-Join Demo Complete");
	}
}
