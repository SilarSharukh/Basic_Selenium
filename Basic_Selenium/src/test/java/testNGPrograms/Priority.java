package testNGPrograms;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority=-3,invocationCount=2)
	public void demo1()
	{
		System.out.println("Hi Demo 1");
	}
	@Test(priority=1,invocationCount=-1)
	public void demo2()
	{
		System.out.println("Hi demo 2");
	}
	
	@Test(priority=-5,invocationCount=3,enabled=false)
	public void demo3()
	{
		System.out.println("Hi demo 3");
	}
}
