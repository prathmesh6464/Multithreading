package com.bridz.multithreading.current_thread;

public class CurrentThread {

	public static void main(String[] args) {
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread);
		MyThread mt1 = new MyThread();
		mt1.setName("MyThread1");
		MyThread mt2 = new MyThread();
		mt1.setName("MyThread2");
		System.out.println("Thread State of MyThread1 before calling start: " + mt1.getState());
		mt1.start();
		mt2.start();
		System.out.println("Thread State of MyThread1 in Main method before Sleep: " + mt1.getState());
		System.out.println("Thread State of MyThread2 in Main method before Sleep: " + mt2.getState());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println("Thread State of MyThread1 in Main method after Sleep: " + mt1.getState());
		System.out.println("Thread State of MyThread2 in Main method after Sleep: " + mt2.getState());
	}
}

class MyThread extends Thread {
	public void run() {
		System.out.println("Run by " + Thread.currentThread().getName());
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
		System.out.println(
				"Thread State of: " + Thread.currentThread().getName() + " -" + Thread.currentThread().getState());
		System.out.println("Exit of Thread: " + Thread.currentThread().getName());
	}
}
