package gun3Odev3.business;

import gun3Odev3.core.logging.Logger;
import gun3Odev3.dataAccess.InstructorDao;
import gun3Odev3.entities.concrete.Instructor;

public class InstructorManager {
	
	InstructorDao instructorDao;
	private Logger[] loggers;
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		super();
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		for (Logger logger : loggers) {
			logger.log(instructor.getFirstName());
		}
	}
	public void delete(Instructor instructor) {
		instructorDao.delete(instructor);
	}
	public void update(Instructor instructor) {
		instructorDao.update(instructor);
		for (Logger logger : loggers) {
			logger.log(instructor.getFirstName());
		}
	}
}
