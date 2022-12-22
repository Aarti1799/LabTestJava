package com.question1;

	public class Employee extends Member{
			String dept, specialization;
			String Name, Address;
			int Age;
			double Phoneno, salary;
			public void details3() 
			{	
				System.out.println("Enter department:");
				    dept = sc.next();
				   System.out.println("Enter Specialization:");
				    specialization = sc.next();
		        	   
			}
			void printdetails3() {
				
				System.out.println("Department:-" +dept);
				System.out.println("SpecialiZation:-" +specialization);

			}


	}



