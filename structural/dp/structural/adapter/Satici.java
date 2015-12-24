package dp.structural.adapter;

public class Satici {

	public static void main(String[] args) {
		Customer customer = new Customer("100", "A��klama",
				"Atat�rk Mah. Gazi Sok. No:15", "Sancaktepe", "�stanbul",
				"T�rkiye");

		Adapter adapter = new Adapter(customer);

		// Art�k "M��teri" s�n�f� da adapt�r sayesinde bir
		// "Adres" s�n�f�d�r.
		Adres adres = adapter;

		System.out.println("Adres : " + adres.getAdres());
		System.out.println("Semt : " + adres.getSemt());
		System.out.println("�ehir : " + adres.getSehir());
		System.out.println("�lke : " + adres.getUlke());

	}
}
