package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("Static yapıcı blok");
	}
	//hepsi çalışır
	static {
		System.out.println("Static yapıcı blok");
	}
	
	
	//yapıcı blok çalışmaz
	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void birsey() {
		//new lemek gerekir direk çağırılmaz
	}
	
	//ana class static olmaz inner class olabilir
	public static class BaskaBirClass{
		public static void Sil() {
			
		}
	}
}
