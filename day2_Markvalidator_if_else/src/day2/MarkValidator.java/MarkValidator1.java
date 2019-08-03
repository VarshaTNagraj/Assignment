package day2.junit;
import java.util.Scanner;
public class MarkValidator1 {
	
	public boolean isPass(int marks)
	{
		if(marks>=40)
		{
			return true;
		}
		else {
			return false;
		}
	}
public	String markGrade(int marks)
	{
		 isPass(0);
		 if(marks>=90 && marks<=100) {
			 return "grade A";
		 }
		 else if(marks>=75 && marks<=90) {
			 return "grade B";
		 }
		 else if(marks>=60 && marks<=75) {
			 return "grade C";
		 }
		 else{
			    return "grade D";
		     } 
	}
	public static void main(String[] args) {
	     int a;
	     Scanner input=new Scanner(System.in);
	     System.out.println("Enter the obtain marks"); 
	     a=input.nextInt();
	     MarkValidator1 mv=new MarkValidator1();
	     boolean result1=mv.isPass(a);
	     String result2=mv.markGrade(a);
	     System.out.println("result is="+ result1);
	     System.out.println("obtain grade is=" + result2);
	     input.close();
		}
	}














