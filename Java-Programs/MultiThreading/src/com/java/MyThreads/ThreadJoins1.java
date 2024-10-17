package com.java.MyThreads;

public class ThreadJoins1 extends Thread{
	
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args)
	{
		ThreadJoins1 t1=new ThreadJoins1();
		ThreadJoins1 t2=new ThreadJoins1();
		ThreadJoins1 t3=new ThreadJoins1();
		
		t1.start();
		try
		{
			t1.join(1500);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t2.start();
		t3.start();
	}

}

