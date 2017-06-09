package com.java.threads.concepts;

public class ThreadExample extends Thread  {
	private Thread t;
	private String threadName;
	ThreadExample(String name ){
		threadName = name;
		System.out.println("Name of the thread was " + threadName );
	}
	@Override
	public void run()
	{
		System.out.println("creating thread ----" + threadName );
		for(int i=0; i<6; i++){
			System.out.println("Thread" + threadName + "Value" + i);
		}
////		private Thread t;
//		private String threadName;
//
//		ThreadExample(String name) {
//
//			threadName = name;
//			System.out.println("creating thread -->" + threadName);
//
//		}
//		@Override
//		public void run(){
//			System.out.println("Runnin thread ----"+ threadName);
//			for(int i=0; i<5; i++)
//			{
//				System.out.println("Thread" + threadName + "and value is " + i);
//			}
		}
		}



