package com.java.Testing;

public class TestDemos {

	public static void main(String[] args) {
		PrintDemo demo = new PrintDemo();
		ThreadDemo thread1 = new ThreadDemo("t1", demo);
		thread1.setPriority(1);
		
		ThreadDemo thread2 =  new ThreadDemo("t2", demo);
		thread2.setPriority(2);
		thread1.start();
		thread2.start();
		

	}

}
