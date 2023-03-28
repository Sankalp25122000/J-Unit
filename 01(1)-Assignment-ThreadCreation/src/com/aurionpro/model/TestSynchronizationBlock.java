package com.aurionpro.model;

class Table1 {
	void printTable(int n) {
		synchronized (this) {
			for (int i = 1; i <= 5; i++) {
				System.out.println(n * i);
				try {
					Thread.sleep(400);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}
}

class MyThread extends Thread {
	Table t;

	MyThread(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThread21 extends Thread {
	Table t;

	MyThread21(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

public class TestSynchronizationBlock {
	public static void main(String args[]) {
		Table obj = new Table();
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start();
	}
}
