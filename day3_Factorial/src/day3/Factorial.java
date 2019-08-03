/*
 * This program calculates the Factorial
 * @Author:Varsha T.N
 * Date:14/07/2019
 */
package day3;
import java.util.Scanner;

public class Factorial {
	public int calculateFactorial(int n)
    {
	int i,f=1;
	for(i=1;i<=n;i++)
	{
		f=f*i;
	}	
	return f;
    }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		Factorial cf=new Factorial();
		int result=cf.calculateFactorial(num);
		System.out.println("Factorial of "+num+" = "+result);
		sc.close();
	}
		
}


