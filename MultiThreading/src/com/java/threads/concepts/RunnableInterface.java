package com.java.threads.concepts;

public class RunnableInterface implements Runnable {
	private Thread t;
	private String threadName;

	public RunnableInterface(String name) {
		threadName = name;
		System.out.println("cretaing the thread " + threadName);
	}

	@Override
	public void run() {
		// TODO Auto -generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread" + threadName + "" + i);
		}
	}

	public void startThread() {
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
}
