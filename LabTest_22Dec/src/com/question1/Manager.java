  package com.question1;

  public class Manager extends Member{

           
String dept,specialization;
String Name, Address;
int Age;
double Phoneno, salary;
public void details2() 
{
			
	System.out.println("Enter department:");
	 dept = sc.next();
	 System.out.println("Enter Specialization:");
	  specialization = sc.next();

}
  void printdetails2() {
				
   System.out.println("Department:-" +dept);
	System.out.println("SpecialiZation:-" +specialization);

			}
}





