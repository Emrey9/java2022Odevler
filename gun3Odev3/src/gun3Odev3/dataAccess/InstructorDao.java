package gun3Odev3.dataAccess;
import gun3Odev3.entities.concrete.Instructor;

public interface InstructorDao {
	
	void add(Instructor instructor);
	void delete(Instructor instructor);
	void update(Instructor instructor);
}
