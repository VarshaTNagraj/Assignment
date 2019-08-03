package day1;

import static org.junit.Assert.*;

import org.junit.Test;

import day1.Hello_World;

public class helloWorldJtest
{
    String message = "Hello World";
    Hello_World messageUtil= new Hello_World();
	@Test
	public void test()
	{
	assertEquals(message,messageUtil.getMessage());
	}

}
