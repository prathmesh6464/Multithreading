package com.bridz.multithreading.current_thread;

public class StateOfThread {

	public static void main(String[] args) {
		
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread);
		
		MyThread myThread1 = new MyThread();
		myThread1.setName("MyThread1");
		
		MyThread myThread2 = new MyThread();
		myThread2.setName("MyThread2");
		
		System.out.println("Thread State of MyThread1 before calling start: " + myThread1.getState());
		System.out.println("Thread State of MyThread2 before calling start: " + myThread2.getState());
		myThread1.start();
		myThread2.start();
		
		System.out.println("Thread State of MyThread1 in Main method before Sleep: " + myThread1.getState());
		System.out.println("Thread State of MyThread2 in Main method before Sleep: " + myThread2.getState());
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("Thread State of MyThread1 in Main method after Sleep: " + myThread2.getState());
		System.out.println("Thread State of MyThread2 in Main method after Sleep: " + myThread2.getState());
	}
}

class MyThread extends Thread {
	public void run() {
		System.out.println("Run by " + Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		System.out.println(
				"Thread State of: " + Thread.currentThread().getName() + " -" + Thread.currentThread().getState());
		System.out.println("Exit of Thread: " + Thread.currentThread().getName());
	}
}
