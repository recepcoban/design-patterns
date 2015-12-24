package dp.behavioral.mediator;

public class Kullanici {
	public static void main(String[] args) {
		// Arabulu sýnýf yaratýlýr.
		final Mediator arabulucu = new Mediator();

		// Arabulucu sýnýfý içeren nesneler yaratýlýyor ve bir
		// diziye ekleniyor. Bu nesneler arasýndaki haberleþmeyi
		// ortak Arabulucu sýnýf saðlayacak.
		final ElektronikAygit[] aygitlar = new ElektronikAygit[3];
		aygitlar[0] = new Bilgisayar(arabulucu);
		aygitlar[1] = new Televizyon(arabulucu);
		aygitlar[2] = new Radyo(arabulucu);

		// Her bir aygýtý çalýþtýr.
		for (final ElektronikAygit aygit : aygitlar) {
			aygit.calistir();
		}
	}
}
