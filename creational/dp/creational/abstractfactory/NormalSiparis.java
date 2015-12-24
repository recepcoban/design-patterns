package dp.creational.abstractfactory;

public class NormalSiparis implements IAbstractFactory {
	@Override
	public IBildirim bildirimYarat() {
		return new Eposta();
	}

	@Override
	public IOdemeTipi odemeTipiYarat() {
		return new PostaCeki();
	}
}
