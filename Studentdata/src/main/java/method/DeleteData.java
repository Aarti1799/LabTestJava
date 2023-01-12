package method;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.student.util.GetConnection;

public class DeleteData extends StudentDetails {
	public void delete() {
		try {
	SessionFactory sf = GetConnection.getconn();
	System.out.println("sf is ready"+sf);
    Session session =sf.openSession();   
   Transaction tr = session.beginTransaction();
    Student s1 = session.get(Student.class, 2);
    session.delete(s1);
    tr.commit();
    session.close();
		}catch(Exception e) {}
	}
}
