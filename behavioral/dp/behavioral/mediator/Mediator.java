package dp.behavioral.mediator;

public class Mediator {
	private Bilgisayar bilgisayar;
	private Televizyon televizyon;
	private Radyo radyo;

	public void bilgisayarEkle(final Bilgisayar bilgisayar) {
		this.bilgisayar = bilgisayar;
	}

	public void radyoEkle(final Radyo radyo) {
		this.radyo = radyo;
	}

	public void televizyonEkle(final Televizyon televizyon) {
		this.televizyon = televizyon;
	}

	public void bilgisayarCalistir() {
		// Bilgisayar �al��t���nda, di�er ayg�tlar�n durmas� isteniyor.
		this.televizyon.durdur();
		this.radyo.durdur();
	}

	public void radyoCalistir() {
		// Radyo �al��t���nda, di�er ayg�tlar�n durmas� isteniyor.
		this.bilgisayar.durdur();
		this.televizyon.durdur();
	}

	public void televizyonCalistir() {
		// Televizyon �al��t���nda, di�er ayg�tlar�n durmas� isteniyor.
		this.bilgisayar.durdur();
		this.radyo.durdur();
	}
}
