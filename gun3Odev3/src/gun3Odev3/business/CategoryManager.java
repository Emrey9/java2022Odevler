package gun3Odev3.business;

import gun3Odev3.core.logging.Logger;
import gun3Odev3.dataAccess.CategoryDao;
import gun3Odev3.entities.concrete.Category;

public class CategoryManager {

	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception {
		
		if(categoryDao.check(category)) {
			throw new Exception("Kategory ismi aynı olamaz.");
		}
		
		categoryDao.add(category);
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
	}
	
	public void delete(Category category) {
		categoryDao.delete(category);
	}
	
	public void update(Category category) {
		categoryDao.update(category);
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
	}
	
}
