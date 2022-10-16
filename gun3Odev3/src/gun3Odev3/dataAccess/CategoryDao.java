package gun3Odev3.dataAccess;

import gun3Odev3.entities.concrete.Category;

public interface CategoryDao {
	void add(Category category);
	void delete(Category category);
	void update(Category category);
	boolean check(Category category);
}
