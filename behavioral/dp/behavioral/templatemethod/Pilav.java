package dp.behavioral.templatemethod;

public class Pilav extends YemekYapici {
	@Override
	public void malzemeHazirla() {
		System.out.println("Pilav malzemeleri hazýrlandý.");
	}

	@Override
	public void pisir() {
		System.out.println("Pilav piþirildi.");
	}

	@Override
	public void servisYap() {
		System.out.println("Pilav servis edildi.");
	}
}
