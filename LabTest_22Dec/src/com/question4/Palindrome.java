/*
 * program:- check Palindrome number
 * @author:- aarti
 * @date:- 22 dec 2022*/

//declaring package
package com.question4;

import java.util.Scanner;
//declaring class
public class Palindrome {
	//creating method for check palindrome number
	public static void checkpalindrome()  
	{
		int num = 0,sum = 0,rev, temp; //initializing variables
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		num = sc.nextInt();
		temp=num;
		while(num>0) //taking while loop
		{
			rev=num%10;
			sum=(sum*10)+rev;
			num=num/10;
			
		}
		if(temp==sum)  //if condition for check palindrome
		
			System.out.println("Number is palindrome");
		else
		
			System.out.println("Number is not a palindrome ");
		
	}
     //main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    checkpalindrome(); //calling method
	}
     //end of main 

}//end of class
