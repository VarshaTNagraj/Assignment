/*
 * This program is celsius to farenheit and vice versa
 * @author:Varsha T.N
 * Date:12-07-2019
 */
package day1;
import java.util.Scanner;
public class Temperature
{
	double celsius(double f)
	{
		return (f-32)*5/9;
	}
	double farenheit(double c)
	{
		return 9*(c/5)+32;
	}
	public static void main(String[] args) 
	{
		double a,b;
		Scanner sc = new Scanner(System.in);
		
		//converting farenheit to celsius
		System.out.println("Enter Farenheit temperature");
		a=sc.nextDouble();
		Temperature tem = new Temperature();
		double result=tem.celsius(a);
		System.out.println("Celsius temperature is="+result);	
		
		//converting celsius to farenheit
		System.out.println("Enter celsius temperature");
		b=sc.nextDouble();
		double result2 = tem.farenheit(b);
		System.out.println("farenheit temperature is="+result2);
		sc.close();
		}
}
