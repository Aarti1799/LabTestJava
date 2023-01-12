package method;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Student")

public class Student {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int id;
		private String name;
		private String contact;
		
		@OneToOne(targetEntity=Course.class,cascade=CascadeType.ALL)
		private Course course;
		
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Student(int id, String name, String contact) {
			super();
			this.id = id;
			this.name = name;
			this.contact = contact;
			this.course = course;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getContact() {
			return contact;
		}

		public void setContact(String contact) {
			this.contact = contact;
		}

		public Course getCourse() {
			return course;
		}

		public void setCourse(Course course) {
			this.course = course;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", contact=" + contact + ", course=\" + course + \"]";
		}
		
}
