package dp.behavioral.observer;

public class Seller {
	public static void main(String[] args) {
		// Bir g�zlem konusu yarat�l�yor.
		final FiyatKonusu konu = new FiyatKonusu();

		// G�zlemci 1 yarat�l�yor ve g�zlem konusuna ekleniyor.
		konu.gozlemciEkle(new Customer1());

		// G�zlemci 2 yarat�l�yor ve g�zlem konusuna ekleniyor.
		konu.gozlemciEkle(new Customer2());

		// G�zlem konusundaki bir de�i�iklik, g�zlemcilere haber veriliyor.
		konu.fiyatDegistir(50L);
	}
}
