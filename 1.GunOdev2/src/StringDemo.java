
public class StringDemo {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";

		System.out.println("Eleman sayısı : " + mesaj.length());
		System.out.println("5. eleman : " + mesaj.charAt(4));
		System.out.println(mesaj.concat("çok"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("a"));

		// yeni metin verir eskisini değiştirmez
		System.out.println(mesaj.replace(' ', '-'));
		System.out.println(mesaj.substring(2)); // parçalamaya başlancak yer
		System.out.println(mesaj.substring(2, 4)); // 2 den başla 4 e kadar al

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim()); // baştaki ve sondaki boşluları siliyor.
	}

}
