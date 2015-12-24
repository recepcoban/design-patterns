package dp.structural.adapter;

public class Customer {
	private final String numara;
	private final String aciklama;
	private final String Adres;
	private final String Semt;
	private final String Sehir;
	private final String Ulke;

	public Customer(String numara, String aciklama, String adres, String semt,
			String sehir, String ulke) {
		this.numara = numara;
		this.aciklama = aciklama;
		this.Adres = adres;
		this.Semt = semt;
		this.Sehir = sehir;
		this.Ulke = ulke;
	}

	public String getNumara() {
		return this.numara;
	}

	public String getAciklama() {
		return this.aciklama;
	}

	public String getAdres() {
		return this.Adres;
	}

	public String getSemt() {
		return this.Semt;
	}

	public String getSehir() {
		return this.Sehir;
	}

	public String getUlke() {
		return this.Ulke;
	}
}
