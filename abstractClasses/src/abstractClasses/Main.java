package abstractClasses;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//anstract sınıflar new lenemez
		
		GameCalculator gameCalculator = new WomanGameCalculator();
		gameCalculator.hesapla();
	}

}
