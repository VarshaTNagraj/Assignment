/*
 *This program test the factorial
 *@Author:Varsha T>N
 *Date:14/07/2019 
 */
package day3;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	public void testAssert() {
		Factorial factorial=new Factorial();
		int actual=factorial.calculateFactorial(2);
		int expected=2;
		assertEquals(actual,expected);
	}

}
