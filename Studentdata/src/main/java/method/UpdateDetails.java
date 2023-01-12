package method;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.student.util.GetConnection;

public class UpdateDetails extends StudentDetails {
	
	public void update() {
		try {
		SessionFactory sf = GetConnection.getconn();
    	System.out.println("sf is ready"+sf);
        Session session =sf.openSession();   
       Transaction tr = session.beginTransaction();
       Student s1=session.get(Student.class, 1);
       s1.setName("arti");
       session.update(s1);
       tr.commit();
       System.out.println("data updated...");
       
       
	}catch(Exception e) 
		{
		}
		}
}
