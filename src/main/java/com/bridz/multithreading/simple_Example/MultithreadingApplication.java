package com.bridz.multithreading.simple_Example;

class MultithreadDemo extends Thread {

	public void run() {
		System.out.println("My thread is in running state.");
	}

}

public class MultithreadingApplication {

	public static void main(String[] args) {
		MultithreadDemo multithreading = new MultithreadDemo();
		multithreading.start();

		// Getting name of thread
		System.out.println(multithreading.getName());

		// Setting name of thread
		multithreading.setName("Thread One two three");

		System.out.println(multithreading.getName());

	}

}