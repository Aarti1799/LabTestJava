
	/*
	 * program:- using inheritance
	 * @author: aarti
	 * @Date:- 22 Dec 2022
	 */
     
package com.question1;
	import java.util.Scanner;
	//declaring class
	public class Member {

		//taking scanner for input
	Scanner sc = new Scanner(System.in);
		
	//declaring variables
		String Name, Address;
		int Age;
		double Phoneno, salary;
		
		//taking method
		public void details1() 
		{
			//taking inputs from users
			System.out.println(" Details:");
		   System.out.println("Enter name:");
		    Name = sc.next();
		   System.out.println("Enter Age:");
	       Age = sc.nextInt();
		   System.out.println("Enter phone number:");
		    Phoneno=sc.nextDouble(); 
		   System.out.println("Address:");
		    Address= sc.next();
		   	 
		}
		//method for input salary
		public void printsalary() {
			System.out.println("Enter Salary:");
		     salary=sc.nextDouble();
				
	     }
		//method for print salary
		void salary() {
			System.out.println("salary:-" +salary);

		}
		
		   //method for print details
		  void printdetails1() {
			   System.out.println("Name:-" + Name);
				System.out.println("Age:-" +Age);
				System.out.println("Phone number:-" +Phoneno);
				System.out.println("Address:-" +Address);
			
		   }

	}//end of class



