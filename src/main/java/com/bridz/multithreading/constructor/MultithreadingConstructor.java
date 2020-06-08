package com.bridz.multithreading.constructor;

class MyThread extends Thread {

	MyThread() {
		// The compiler creates the byte code equivalent of super ();
	}

	MyThread(String name) {
		setName(name); // Pass name to Thread superclass
	}

	public void run() {
		System.out.println("My name is: " + getName());
	}
}

public class MultithreadingConstructor {

	public static void main(String args[]) {

		MyThread thread;

		thread = new MyThread();
		thread.start();
		
		thread = new MyThread("MCA");
		thread.start();
	}
}