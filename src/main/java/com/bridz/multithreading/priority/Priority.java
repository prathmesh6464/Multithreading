package com.bridz.multithreading.priority;

public class Priority {

	public static void main(String[] args) {
		Thread tread = Thread.currentThread();
		tread.setName("Admin Thread");
		// set thread priority to 1
		tread.setPriority(1);
		// prints the current thread
		System.out.println("Thread = " + tread);
		int priority = tread.getPriority();
		System.out.println("Thread priority= " + priority);
		int count = Thread.activeCount();
		System.out.println("currently active threads = " + count);
	}
}