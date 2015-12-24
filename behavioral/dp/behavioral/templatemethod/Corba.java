package dp.behavioral.templatemethod;

public class Corba extends YemekYapici {
	@Override
	public void malzemeHazirla() {
		System.out.println("�orba malzemeleri haz�rland�.");
	}

	@Override
	public void pisir() {
		System.out.println("�orba pi�irildi.");
	}

	@Override
	public void servisYap() {
		System.out.println("�orba servis edildi.");
	}
}
