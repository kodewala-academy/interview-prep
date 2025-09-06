package com.kodewala.threads;

public class ThreadDemo extends Thread
{
	
	// Every object in java got on object lock --> t10 --> took the lock from object, remaining lock = 0;
	// Every class in java got on class lock
	
	public synchronized void doFundTransfer()
	{
		System.out.println("ThreadDemo.doFundTransfer()");
	}

	@Override
	public void run()
	{
		doFundTransfer();
		System.out.println(" Current Thread --> " + Thread.currentThread().getName());
	}

	public static void main(String[] args) // created by JVM (main)
	{
		System.out.println(" Current Thread --> " + Thread.currentThread().getName());

		ThreadDemo demo = new ThreadDemo();

		Thread t1 = new Thread(demo); // Creating new thread. State = "NEW"

		t1.start(); // start the thread. NEW to RUNNABLE --> RUNNING --> TERMINATED

		System.out.println(" Current Thread --> " + Thread.currentThread().getName());
		System.out.println("ThreadDemo.main() END");

	}

}
