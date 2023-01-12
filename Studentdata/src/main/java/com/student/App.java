package com.student;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.student.util.GetConnection;

import method.Course;
import method.DeleteData;
import method.RetrieveData;
import method.Student;
import method.StudentDetails;
import method.UpdateDetails;

/**
 * Hello world!
 *
 */
public class App 
{
	 static void menu() {
		System.out.println("Select any option from the menu:");
		System.out.println("1. Insert new data of student.");
		System.out.println("2. Retrieve data");
		System.out.println("3. Update data of student.");
		System.out.println("4. Delete data of student.");
	 }
	
	
    public static void main( String[] args )
    {
		 Scanner sc = new Scanner(System.in);
       System.out.println("---------------------STUDENT MANAGEMENT---------------------");
       
        System.out.println("Enter username:");
        String username = sc.next();
        System.out.println("Enter password:");
        String password = sc.next();
        System.out.println("...login success..."); 
      
       menu();
       
       int ch;
       System.out.println("Enter choice:");
       ch=sc.nextInt();
       switch(ch) {
        case 1:  StudentDetails sd = new StudentDetails();
                 sd.inputdetails();
                 break;
        case 2: RetrieveData rd = new RetrieveData();
                 rd.retrieve();
                 break;
       case 3: UpdateDetails ud = new UpdateDetails(); 
                 ud.update();
                 break;
       case 4:  DeleteData dd = new DeleteData();
                 dd.delete();
                 break;
       default : System.out.println("wrong input...");
        
       }    
    }
	}
