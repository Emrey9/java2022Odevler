
public class sayiBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 5;
		boolean isFind = false;
		
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				isFind = true;
				break;
			}
		}
		
		if (isFind) {
			System.out.println("Sayı bulundu");
		} else {
			System.out.println("Sayı bulunamadı");
		}
	}

}
