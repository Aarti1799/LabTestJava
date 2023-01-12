package method;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Course")
public class Course {

	    @Id
		private int course_id;
	    private String c_name;
	    private String c_duration;
		
	    public Course() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Course(int course_id, String c_name, String c_duration) {
			super();
			this.course_id = course_id;
			this.c_name = c_name;
			this.c_duration = c_duration;
		}

		public int getCourse_id() {
			return course_id;
		}

		public void setCourse_id(int course_id) {
			this.course_id = course_id;
		}

		public String getC_name() {
			return c_name;
		}

		public void setC_name(String c_name) {
			this.c_name = c_name;
		}

		public String getC_duration() {
			return c_duration;
		}

		public void setC_duration(String c_duration) {
			this.c_duration = c_duration;
		}

		@Override
		public String toString() {
			return "Course [course_id=" + course_id + ", c_name=" + c_name + ", c_duration=" + c_duration + "]";
		}


}
