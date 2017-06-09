package com.java.Testing;

public class ThreadDemo extends Thread {
	private Thread t;
	private String threadName;
	PrintDemo printDemo;

	public ThreadDemo(String name, PrintDemo pd ) {
		threadName = name;
		printDemo = pd;
		
		
	}

	public void run()
{
		synchronized (printDemo) {
		printDemo.printCount();
		}
		}
		
}


