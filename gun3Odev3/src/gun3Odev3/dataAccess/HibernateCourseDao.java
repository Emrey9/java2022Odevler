package gun3Odev3.dataAccess;

import java.util.ArrayList;
import java.util.List;

import gun3Odev3.entities.concrete.Course;

public class HibernateCourseDao implements CourseDao{

	List<String> courses;
	
	public HibernateCourseDao() {
		courses = new ArrayList<>();
	}

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile sisteme eklendi.");
		courses.add(course.getName());
	}

	@Override
	public void delete(Course course) {
		System.out.println("Hibernate ile sistemden silindi.");
		
	}

	@Override
	public void update(Course course) {
		System.out.println("Hibernate ile sistemden güncellendi.");
		
	}

	@Override
	public boolean check(Course course) {
		if(courses.isEmpty()) {
			return false;
		}
		return courses.contains(course.getName());
	}

}
