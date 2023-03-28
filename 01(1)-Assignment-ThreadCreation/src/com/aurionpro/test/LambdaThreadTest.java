package com.aurionpro.test;

public class LambdaThreadTest {

	public static void main(String[] args) {
		new Thread(() -> {
			for(int i = 1; i<=3; i++) {
				System.out.println("Thread using Lambda "+i);
			}
			
		}).start();

	}

}
