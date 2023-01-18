package method;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.student.util.GetConnection;

public class StudentDetails {
	
	public void inputdetails() {
		SessionFactory sf = GetConnection.getconn();
    	System.out.println("sf is ready"+sf);
        Session session =sf.openSession();   
       Transaction tr = session.beginTransaction();
      
        Course c1=new Course(301,"java","3 months");
    	Course c2 = new Course(302,".Net","3 months");
     	session.save(c1);
    	session.save(c2);    	   	
    	Student s1 = new Student();
        s1.setId(1);
    	s1.setName("nitya");
    	s1.setContact("345678989");
    	s1.setCourse(c1);    	    	
    	Student s2 = new Student();
    	s2.setId(2);
    	s2.setName("tanya");
    	s2.setContact("876578989");
    	s2.setCourse(c2);    	
    	session.save(s1);
    	session.save(s2);  
    	tr.commit();
    	System.out.println( "save data" );    
    	session.close();     
    }
      
	}


