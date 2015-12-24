package dp.creational.abstractfactory;

public class HizliSiparis implements IAbstractFactory {
	@Override
	public IBildirim bildirimYarat() {
		return new Sms();
	}

	@Override
	public IOdemeTipi odemeTipiYarat() {
		return new Havale();
	}
}
