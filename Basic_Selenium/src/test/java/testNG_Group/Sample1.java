package testNG_Group;

import org.testng.annotations.Test;

public class Sample1 {
@Test(groups="smokes")
public void demo1()
{
	System.out.println("Hi demo1");
}
@Test
public void demo2()
{
	System.out.println("Hi demo2");
}
}
