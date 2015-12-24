package dp.behavioral.mediator;

public class Radyo extends ElektronikAygit {

	public Radyo(Mediator arabulucu) {
		super(arabulucu);
		arabulucu.radyoEkle(this);
	}

	@Override
	public void calistir() {
		this.arabulucu.radyoCalistir();
		System.out.println("Radyo Çalýþtý.");
	}

	@Override
	public void durdur() {
		System.out.println("Radyo Durdu!");
	}
}
