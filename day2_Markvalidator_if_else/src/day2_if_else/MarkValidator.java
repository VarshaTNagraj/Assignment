/*
 * This program checks the the given mark is Pass or fail using Switch statement
 * @Author:Varsha T.N
 * Date:13/07/2019
 */
package day2_if_else;
import java.util.Scanner;
public class MarkValidator
     {
	     boolean isPass(int marks)
	     { 
	 		 if(marks>=40)
		 {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the result=");
		int result=input.nextInt();
		MarkValidator mark=new MarkValidator();
		boolean obtain=mark.isPass(result);
		System.out.println("Result="+obtain);
		int i;
		if(result>=90 && result<=100)
		{
			i=0;
		}
		else if(result>=75 && result<=90)
		{
		    i=1;
		}
		else if(result>=60 && result<=75)
		{
	        i=2; 
		}
		else {
			i=3;
 	    }
   		switch(i)
		{
			case 0:
			       System.out.println("Grade=A");
			break;
			case 1:					   
			       System.out.println("Grade=B");
		       
			break;
			case 2:
 		     	   System.out.println("Grade=C");
 	 	    break;
			default:System.out.println("Grade=D");
		}
		input.close();
		}
	}




