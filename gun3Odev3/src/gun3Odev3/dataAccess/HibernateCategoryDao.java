package gun3Odev3.dataAccess;

import java.util.ArrayList;
import java.util.List;

import gun3Odev3.entities.concrete.Category;

public class HibernateCategoryDao implements CategoryDao{

	List<String> categories;
	
	public HibernateCategoryDao() {
		categories = new ArrayList<String>();
	}

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile sisteme eklendi.");
		categories.add(category.getName());
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Hibernate ile sistemden silindi.");
		
	}

	@Override
	public void update(Category category) {
		System.out.println("Hibernate ile sistemde güncellendi.");
		
	}

	@Override
	public boolean check(Category category) {
		if(categories.isEmpty()) {
			return false;
		}
		return categories.contains(category.getName());
	}

}
