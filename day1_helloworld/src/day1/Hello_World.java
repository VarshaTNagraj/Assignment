/*
 * This program will print the message = "Hello World"
 * @Author Varsha T.N
 * @Date: 12/7/19
 */
package day1;
public class Hello_World
{
	private String message = "Hello World";
	public String getMessage()
	{
		System.out.println(message);
		return message;
	}
	public static void main(String[] args)
	{
		Hello_World myStr = new Hello_World();
		 System.out.println("myString = "+myStr.message);
	}

}
