/*
 * program:- check Prime number
 * @author:- aarti
 * @date:- 22 dec 2022*/

//declaring package
package com.question3;

	import java.util.Scanner;
    //declaring class
	public class PrimeNumber {
		
		//taking method
		public static void checkprime() 
		{
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number");
			int  num=sc.nextInt();
			
			if(num%2!=0) ///if condition for check no is prime or not
			{
				System.out.println("prime number");
			}
			else
			{
				System.out.println("not prime number");
			}
		}//end of if else
		
		//main method
		public static void main(String[] args) 
		{
			
		checkprime();  //calling method
		}//end of main

}//end of class
