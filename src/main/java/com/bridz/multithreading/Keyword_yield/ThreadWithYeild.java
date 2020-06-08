package com.bridz.multithreading.keyword_yield;

public class ThreadWithYeild extends Thread {
	public void run() {
		System.out.println("In run");
		yield();
		System.out.println("Leaving run");
	}

	public static void main(String[] argv) {
		(new ThreadWithYeild()).start();
		yield();
		System.out.println("Main thread");
	}
}
