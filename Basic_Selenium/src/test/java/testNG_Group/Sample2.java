package testNG_Group;

import org.testng.annotations.Test;

public class Sample2 {
	@Test
	public void demo3()
	{
		System.out.println("Hi demo3");
	}
	@Test(groups="smokes")
	public void demo4()
	{
		System.out.println("Hi demo4");
	}
}
