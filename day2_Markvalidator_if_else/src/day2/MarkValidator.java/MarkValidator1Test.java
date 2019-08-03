package day2.junit;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import day2.junit.MarkValidator1;

@RunWith(JUnit4.class)
public class MarkValidator1Test {

	@Test
	public void testAssert()
	{	
	    MarkValidator1 markValidator1 = new  MarkValidator1();
		boolean actual=markValidator1.isPass(70);//.markgrade();
		boolean expected=true;
		assertEquals(actual,expected);
        String actual1=markValidator1.markGrade(70);
        String expected1="grade C";
		assertEquals(actual1,expected1);
	}  
}
