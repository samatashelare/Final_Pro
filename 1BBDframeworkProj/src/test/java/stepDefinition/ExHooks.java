package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ExHooks {
	
	@Before(order=1)
	public void test1()
	{
		System.out.println("test1 method");
	}
	
	@After(order=1)
	public void test2()
	{
		System.out.println("test2 method");
	}
	
	@Before(order=2)
	public void test3()
	{
		System.out.println("test3 method");
	}
	
	@After(order=2)
	public void test4()
	{
		System.out.println("test4 method");
	}

}
