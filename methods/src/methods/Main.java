package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();

	}

	public static void sayiBulmaca() {
		int number = 6;
		int total = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total += i;
			}
		}

		if (number == total) {
			mesajVer("Sayı mevcuttur : " + number); 
		} else {
			mesajVer("Sayı mükemmel sayı değildir : " + number); 
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
