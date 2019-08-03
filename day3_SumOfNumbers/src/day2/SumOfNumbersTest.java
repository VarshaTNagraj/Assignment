/*
 * This program test the Sum of even numbers and odd numbers
 * @Author:Varsha T.N
 * Date:13/07/2019
 */
package day2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SumOfNumbersTest {

	    @Test
	    public void testAssert() {
		SumOfNumbers son=new SumOfNumbers();
		@SuppressWarnings("static-access")
		
		int actual_even=son.sumOfEvenNumbers(1,5);
		int expected_even=6;
		int actual_odd=son.sumOfOddNumbers(1,4);
		int expected_odd=4;
		Assert.assertEquals( expected_even, actual_even);
		Assert.assertEquals(expected_odd, actual_odd);
		
	}

}
