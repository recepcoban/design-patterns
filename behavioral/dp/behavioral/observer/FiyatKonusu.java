package dp.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class FiyatKonusu implements Konu {

	private final List<Observer> observers = new ArrayList<Observer>();
	private long fiyat;

	@Override
	public void gozlemciEkle(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void gozlemcilereHaberVer() {
		for (final Observer observer : this.observers) {
			observer.guncelle(this.fiyat);
		}
	}

	public void fiyatDegistir(final long fiyat) {
		this.fiyat = fiyat;
		gozlemcilereHaberVer();
	}
}
