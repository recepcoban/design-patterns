package dp.behavioral.mediator;

public class Televizyon extends ElektronikAygit {

	public Televizyon(Mediator arabulucu) {
		super(arabulucu);
		arabulucu.televizyonEkle(this);
	}

	@Override
	public void calistir() {
		this.arabulucu.televizyonCalistir();
		System.out.println("Televizyon Çalýþtý.");
	}

	@Override
	public void durdur() {
		System.out.println("Televizyon Durdu!");
	}
}
