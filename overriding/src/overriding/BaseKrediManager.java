package overriding;

public class BaseKrediManager {

	//final yaparsan override yapılamaz
	public double hesapla(double tutar) {
		return tutar * 1.8;
	}
}
