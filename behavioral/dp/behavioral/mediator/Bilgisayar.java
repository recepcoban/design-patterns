package dp.behavioral.mediator;

public class Bilgisayar extends ElektronikAygit {

	public Bilgisayar(Mediator arabulucu) {
		super(arabulucu);
		arabulucu.bilgisayarEkle(this);
	}

	@Override
	public void calistir() {
		this.arabulucu.bilgisayarCalistir();
		System.out.println("Bilgisayar Çalýþtý.");
	}

	@Override
	public void durdur() {
		System.out.println("Bilgisayar Durdu!");
	}
}
