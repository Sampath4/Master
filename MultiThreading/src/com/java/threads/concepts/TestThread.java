package com.java.threads.concepts;

public class TestThread 
{

	public static void main(String[] args) {
		Thread t1 = new Thread("thread 1");
		t1.start();
		Thread t2 = new Thread("thread 2");
		t2.start();
		

	}

}
