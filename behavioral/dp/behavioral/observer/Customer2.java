package dp.behavioral.observer;

public class Customer2 implements Observer {
	@Override
	public void guncelle(long yeniFiyat) {
		System.out.println("Customer 2, yeni fiyatý öðrendi => " + yeniFiyat);
	}
}
