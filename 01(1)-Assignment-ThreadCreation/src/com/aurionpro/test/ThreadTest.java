package com.aurionpro.test;

public class ThreadTest extends Thread implements Runnable{
	
	public void run() {
		System.out.println("Thread is running..");
	}

	public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest();
        Thread thread = new Thread(t1);
        thread.start();
        
        
	}

}
