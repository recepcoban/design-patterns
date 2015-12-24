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
		return "�stanbul";
	}

	@Override
	public String getUlke() {
		return "T�rkiye";
	}
}
