package dp.structural.adapter;

public class IsAdresi implements Adres {
	@Override
	public String getAdres() {
		return "Meydan Mah. No:21";
	}

	@Override
	public String getSemt() {
		return "Taksim";
	}

	@Override
	public String getSehir() {
		return "İstanbul";
	}

	@Override
	public String getUlke() {
		return "Türkiye";
	}
}
