package dp.behavioral.templatemethod;

public class Corba extends YemekYapici {
	@Override
	public void malzemeHazirla() {
		System.out.println("Çorba malzemeleri hazýrlandý.");
	}

	@Override
	public void pisir() {
		System.out.println("Çorba piþirildi.");
	}

	@Override
	public void servisYap() {
		System.out.println("Çorba servis edildi.");
	}
}
