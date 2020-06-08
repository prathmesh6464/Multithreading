package com.birdz.multithreading.runnable_interface;

class MultithreadUsingRunnable implements Runnable {

	public void run() {
		System.out.println("My thread is in running state.");
	}

	public static void main(String args[]) {
		MultithreadUsingRunnable multithreadUsingRunnable = new MultithreadUsingRunnable();
		Thread thread = new Thread(multithreadUsingRunnable);
		thread.start();
	}
}