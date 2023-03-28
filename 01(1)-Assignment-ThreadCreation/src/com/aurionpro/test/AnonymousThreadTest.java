package com.aurionpro.test;

public class AnonymousThreadTest {

	public static void main(String[] args) {
		new Thread() {
			public void run() {
				for (int i = 1; i <= 3; i++) {
					System.out.println("In run() method " + i);
				}
			}
		}.start();

	}

}
