package dp.creational.abstractfactory;

public class SiparisGonder {

	public static void main(String[] args) {
		siparis("h�zl�", 1000);
	}

	public static void siparis(String mesaj, Integer miktar) {
		IAbstractFactory abstractFactory = null;

		if (mesaj.equals("h�zl�")) {
			abstractFactory = new HizliSiparis();
		} else {
			abstractFactory = new NormalSiparis();
		}

		final IOdemeTipi odemeTipi = abstractFactory.odemeTipiYarat();
		final IBildirim bildirim = abstractFactory.bildirimYarat();

		odemeTipi.paraGonder(miktar);
		bildirim.mesajGonder("Sipari�iniz g�nderilmi�tir.");
	}

}
