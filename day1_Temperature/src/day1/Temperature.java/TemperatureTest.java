/*
 * This program is junit test celsius to farenheit and vice versa
 * @author:Varsha T.N
 * Date:12-07-2019
 */
package day1.junit;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TemperatureTest {

	@Test
	public void testAssert() {
		Temperature temp = new Temperature();
		double actual_far=temp.farenheit(100);
		double expected_far=212;
		double actual_cel=temp.celsius(70);
		double expected_cel=21.11111111111111;
		Assert.assertEquals(Double.toString(expected_far), Double.toString(actual_far));
		Assert.assertEquals(Double.toString(expected_cel), Double.toString(actual_cel));
		}
	
}
