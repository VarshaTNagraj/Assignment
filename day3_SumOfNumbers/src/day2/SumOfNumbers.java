/*
 * This program gives sum of even and sum of odd values for the given starting and ending numbers
 * @Author:Varsha T.N
 * Date:13/07/2019
 */
package day2;
import java.util.Scanner;

public class SumOfNumbers
{
	public static int sumOfEvenNumbers(int start , int end)
	{
	int sum=0;
	for(int i =start;i<=end;i++)
	{
		if(i%2==0)
			sum+=i;
	}
	System.out.println("sum of even number="+sum);
	
		return sum;
	
	//System.out.println("sum of even number="+sum);
	
	 
}
    public static int sumOfOddNumbers(int start,int end)
    {
    int sum=0;
    for(int i=start;i<=end;i++)
    {
	if(i%2!=0)
	sum+=i;
    }
     System.out.println("sum of odd number="+sum);
     return sum;
    }
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("enter starting and ending number");
 // SumOfNumbers son=new  SumOfNumbers();
  int start=sc.nextInt();
  int end=sc.nextInt();
  sumOfEvenNumbers(start,end);
  sumOfOddNumbers(start,end); 
  sc.close();
  
}
}
	
 	
