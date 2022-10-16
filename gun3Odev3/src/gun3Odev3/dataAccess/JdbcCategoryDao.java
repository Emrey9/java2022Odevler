package gun3Odev3.dataAccess;

import java.util.ArrayList;
import java.util.List;

import gun3Odev3.entities.concrete.Category;

public class JdbcCategoryDao implements CategoryDao{

	List<String> categories;
	
	public JdbcCategoryDao() {
		categories = new ArrayList<String>();
	}

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile sisteme eklendi.");
		categories.add(category.getName());
	}

	@Override
	public void delete(Category category) {
		System.out.println("JDBC ile sistemden silindi.");
		
	}

	@Override
	public void update(Category category) {
		System.out.println("JDBC ile sistemde güncellendi.");
		
	}

	@Override
	public boolean check(Category category) {
		
		return categories.contains(category.getName());
	}

}
