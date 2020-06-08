package com.bridz.multithreading.daemon_thread;

public class DaemonThread {

	public static void main(String args[]) {

		MyThread myThread = new MyThread();
		myThread.setDaemon(true);
		myThread.start();

	}
}

class MyThread extends Thread {
	public void run() {
		System.out.println("Daemon is " + isDaemon());
	}
}