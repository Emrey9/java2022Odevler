
public class miniProjeAsalSayı {

	public static void main(String[] args) {
		int number = 12;
		
		boolean isPrime = true;
		
		if (number == 1) {
			System.out.println("Sayı asal sayı değildir");
		}
		
		if (number < 1) {
			System.out.println("Geçersiz sayı");
		}
		
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if (isPrime) {
			System.out.println("Sayı asaldır");
		} else {
			System.out.println("Sayı asal değildir");
		}

	}

}
