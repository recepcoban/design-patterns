package dp.behavioral.observer;

public class Seller {
	public static void main(String[] args) {
		// Bir gözlem konusu yaratýlýyor.
		final FiyatKonusu konu = new FiyatKonusu();

		// Gözlemci 1 yaratýlýyor ve gözlem konusuna ekleniyor.
		konu.gozlemciEkle(new Customer1());

		// Gözlemci 2 yaratýlýyor ve gözlem konusuna ekleniyor.
		konu.gozlemciEkle(new Customer2());

		// Gözlem konusundaki bir deðiþiklik, gözlemcilere haber veriliyor.
		konu.fiyatDegistir(50L);
	}
}
