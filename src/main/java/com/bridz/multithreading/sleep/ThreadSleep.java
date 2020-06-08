package com.bridz.multithreading.sleep;

class MyThread extends Thread {
	public void run() {
		System.out.println("My thread is in running state.");
	}
}

public class ThreadSleep {

	public static void main(String args[]) {

		MyThread myThread = new MyThread();

		System.out.println(myThread.isAlive());

		myThread.start();

		System.out.println(myThread.isAlive());

		while (myThread.isAlive()) {

			System.out.println(myThread.isAlive());

			try {
				myThread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("Sleeping thread interrupted");
			}
			System.out.println("Thread-Sleep Demo Complete");

			System.out.println(myThread.isAlive());

		}
	}
}