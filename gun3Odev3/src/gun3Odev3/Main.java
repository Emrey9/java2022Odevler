package gun3Odev3;

import gun3Odev3.business.CategoryManager;
import gun3Odev3.business.CourseManager;
import gun3Odev3.business.InstructorManager;
import gun3Odev3.core.logging.DatabaseLogger;
import gun3Odev3.core.logging.FileLogger;
import gun3Odev3.core.logging.Logger;
import gun3Odev3.core.logging.MailLogger;
import gun3Odev3.dataAccess.HibernateCategoryDao;
import gun3Odev3.dataAccess.HibernateInstructorDao;
import gun3Odev3.dataAccess.JdbcCategoryDao;
import gun3Odev3.dataAccess.JdbcCourseDao;
import gun3Odev3.entities.concrete.Category;
import gun3Odev3.entities.concrete.Course;
import gun3Odev3.entities.concrete.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		Instructor instructor1 = new Instructor(1,"Engin","Demiroğ");
		
		Course course1 = new Course(1, "Java", 1, 15);
		Course course2 = new Course(2, "C#", 1, -9);
		Course course3 = new Course(3, "Java", 1, 30);
		
		Category category1 = new Category(1, "Yazılım");
		Category category2 = new Category(2, "Yabancı dil");
		Category category3 = new Category(3, "Yabancı dil");
		
		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };
		
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
		
		instructorManager.add(instructor1);
		
		courseManager.add(course1);
		//courseManager.add(course2);
		//courseManager.add(course3);
		
		categoryManager.add(category1);
		categoryManager.add(category2);
		//categoryManager.add(category3);
	}

}
