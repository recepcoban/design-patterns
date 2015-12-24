package dp.behavioral.observer;

public class Customer1 implements Observer {
	@Override
	public void guncelle(long yeniFiyat) {
		System.out.println("Customer 1, yeni fiyatý öðrendi => " + yeniFiyat);
	}
}
