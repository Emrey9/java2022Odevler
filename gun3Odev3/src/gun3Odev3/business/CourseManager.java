package gun3Odev3.business;

import gun3Odev3.core.logging.Logger;
import gun3Odev3.dataAccess.CourseDao;
import gun3Odev3.entities.concrete.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		
		if(courseDao.check(course)) {
			throw new Exception("Kurs ismi aynı olamaz");
		}
		if(course.getPrice() < 0) {
			throw new Exception("fiyatı sıfırdan küçük olmamalıdır");
		}
		
		
		courseDao.add(course);
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}
	
	public void delete(Course course) {
		courseDao.delete(course);
	}
	
	public void update(Course course) {
		courseDao.update(course);
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}
}
