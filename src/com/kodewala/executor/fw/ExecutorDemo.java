package com.kodewala.executor.fw;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread
{
	private int taskId;

	Task(int _taskId)
	{
		this.taskId = _taskId;
	}

	@Override
	public void run()
	{
		System.out.println("Task.run() Executing task " + taskId + " by " + Thread.currentThread().getName());
	}

}

public class ExecutorDemo
{

	public static void main(String[] args)
	{
		ExecutorService executorService = Executors.newFixedThreadPool(3); // fixed pool of 3 threads.

		for (int i = 0; i <= 9; i++)
		{
			executorService.execute(new Task(i));
		}

		executorService.shutdown();
	}

}
