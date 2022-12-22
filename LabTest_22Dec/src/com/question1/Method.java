package com.question1;

	public class Method extends Member{

			//main method
				public static void main(String[] args)
				{
					
					Manager m= new Manager();  //object of manager class
					Employee e = new Employee();  //object of employee class
					
					e.details1();     
					e.details3();
					e.printsalary();
					System.out.println("---------------------------------------");
				
					
					m.details1();
					m.details2();
					m.printsalary();
					System.out.println("---------------------------------------");
					e.printdetails1();
					e.printdetails3();
					e.salary();
					
					System.out.println("---------------------------------------");
					m.printdetails1();
					m.printdetails2();
					m.salary();
						   
				}// end of main
		}//end of class





