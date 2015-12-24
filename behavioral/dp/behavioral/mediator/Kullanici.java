package dp.behavioral.mediator;

public class Kullanici {
	public static void main(String[] args) {
		// Arabulu s�n�f yarat�l�r.
		final Mediator arabulucu = new Mediator();

		// Arabulucu s�n�f� i�eren nesneler yarat�l�yor ve bir
		// diziye ekleniyor. Bu nesneler aras�ndaki haberle�meyi
		// ortak Arabulucu s�n�f sa�layacak.
		final ElektronikAygit[] aygitlar = new ElektronikAygit[3];
		aygitlar[0] = new Bilgisayar(arabulucu);
		aygitlar[1] = new Televizyon(arabulucu);
		aygitlar[2] = new Radyo(arabulucu);

		// Her bir ayg�t� �al��t�r.
		for (final ElektronikAygit aygit : aygitlar) {
			aygit.calistir();
		}
	}
}
