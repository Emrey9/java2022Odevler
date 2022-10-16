package gun3Odev3.dataAccess;
import gun3Odev3.entities.concrete.Course;

public interface CourseDao {
	void add(Course course);
	void delete(Course course);
	void update(Course course);
	boolean check(Course course);
}
