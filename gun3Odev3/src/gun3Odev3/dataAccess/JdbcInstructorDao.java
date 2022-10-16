package gun3Odev3.dataAccess;

import gun3Odev3.entities.concrete.Instructor;

public class JdbcInstructorDao implements InstructorDao{
	
	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBC ile veritabanına eklendi.");
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("JDBC ile veritabanından silindi.");
		
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("JDBC ile veritabanında güncellendi.");
		
	}
}
