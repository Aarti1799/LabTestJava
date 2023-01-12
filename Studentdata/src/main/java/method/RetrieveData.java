package method;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.student.util.GetConnection;

public class RetrieveData extends StudentDetails {
	
	public void retrieve() {
		try {
		SessionFactory sf = GetConnection.getconn();
    	System.out.println("sf is ready"+sf);
        Session session =sf.openSession();   
       Transaction tr = session.beginTransaction();
       System.out.println("Fetching data.........");
       Student s1 = (Student) session.get(Student.class, 1);      
       System.out.println(s1);
     
       tr.commit();
	
	}catch(Exception e) 
	{
	}
	}
}
