package gun3Odev3.dataAccess;

import java.util.ArrayList;
import java.util.List;

import gun3Odev3.entities.concrete.Course;

public class JdbcCourseDao implements CourseDao{
	
	List<String> courses;
	
	public JdbcCourseDao() {
		courses = new ArrayList<String>();
	}

	@Override
	public void add(Course course) {
		System.out.println("JDBC ile sisteme eklendi.");
		courses.add(course.getName());
	}

	@Override
	public void delete(Course course) {
		System.out.println("JDBC ile sistemden silindi.");
		
	}

	@Override
	public void update(Course course) {
		System.out.println("JDBC ile sistemden güncellendi.");
		
	}
	
	@Override
	public boolean check(Course course) {
		if(courses.isEmpty()) {
			return false;
		}
		return courses.contains(course.getName());
	}
}
