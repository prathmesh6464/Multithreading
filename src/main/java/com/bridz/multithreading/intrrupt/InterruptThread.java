package com.bridz.multithreading.intrrupt;

public class InterruptThread {

	public static void main(String args[]) {
		TestThreadInterrupt t1 = new TestThreadInterrupt();
		TestThreadInterrupt t2 = new TestThreadInterrupt();
		t1.start();
		t1.interrupt();
		t2.start();
	}

}

class TestThreadInterrupt extends Thread {
	public void run() {
		for (int i = 1; i <= 2; i++) {
			if (Thread.interrupted()) {
				System.out.println("code for interrupted thread");
			} else {
				System.out.println("code for normal thread");
			}
		} // end of for loop
	}
}