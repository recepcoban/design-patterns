package dp.structural.adapter;

public class Satici {

	public static void main(String[] args) {
		Customer customer = new Customer("100", "Açýklama",
				"Atatürk Mah. Gazi Sok. No:15", "Sancaktepe", "Ýstanbul",
				"Türkiye");

		Adapter adapter = new Adapter(customer);

		// Artýk "Müþteri" sýnýfý da adaptör sayesinde bir
		// "Adres" sýnýfýdýr.
		Adres adres = adapter;

		System.out.println("Adres : " + adres.getAdres());
		System.out.println("Semt : " + adres.getSemt());
		System.out.println("Þehir : " + adres.getSehir());
		System.out.println("Ülke : " + adres.getUlke());

	}
}
