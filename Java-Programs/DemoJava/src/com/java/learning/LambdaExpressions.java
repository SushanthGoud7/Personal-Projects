package com.java.learning;

interface A
{
	void ride();
}
/*public class B implements A
{
	public void ride()
	{
		System.out.println("hello mphasis chennai");
	}
}*/
public class LambdaExpressions
{
	public static void main(String[] args) {
		//Type 1
		/*A obj=new A()
				{
			public void ride()
			{
				System.out.println("hello mphasis bangalore");
			}
				};
				obj.ride();*/
		
		// Type 2
		/*iA obj=() ->
		{
			System.out.println("something magical");
		};
		obj.ride();*/
		
		//Type 3
		A obj = () -> System.out.println("something magical!");
		obj.ride();
		
		

	}
}

