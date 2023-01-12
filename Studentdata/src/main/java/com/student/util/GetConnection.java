package com.student.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import method.Course;
import method.DeleteData;
import method.Login;
import method.RetrieveData;
import method.Student;
import method.StudentDetails;
import method.UpdateDetails;


public class GetConnection {

	private static SessionFactory sf;

	public static SessionFactory getconn() {
		try {
		 Configuration cfg = new Configuration();
		 Properties pr = new Properties();
		 pr.put(Environment.USER, "root");
		 pr.put(Environment.PASS, "arti@123");
		 pr.put(Environment.URL, "jdbc:mysql://localhost:3306/Student");
		 pr.put(Environment.SHOW_SQL, "true");
		 pr.put(Environment.HBM2DDL_AUTO, "update");
		 pr.put(Environment.FORMAT_SQL, "true");
		 cfg.setProperties(pr);
		 cfg.addAnnotatedClass(Student.class);
		 cfg.addAnnotatedClass(Login.class);
		 cfg.addAnnotatedClass(Course.class);
		 cfg.addAnnotatedClass(RetrieveData.class);
		 cfg.addAnnotatedClass(StudentDetails.class);
		 cfg.addAnnotatedClass(UpdateDetails.class);
		 cfg.addAnnotatedClass(DeleteData.class);
		 ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		 sf=cfg.buildSessionFactory(sr);
		
		}
		catch(Exception e) {
			
		}
		return sf;
	}
}
