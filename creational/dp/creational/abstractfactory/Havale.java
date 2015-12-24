package dp.creational.abstractfactory;

public class Havale implements IOdemeTipi {
	@Override
	public void paraGonder(Integer miktar) {
		System.out.println("Havale ile <" + miktar
				+ "> TL para gönderilmiþtir.");
	}
}
