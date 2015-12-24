package dp.creational.abstractfactory;

public class PostaCeki implements IOdemeTipi {
	@Override
	public void paraGonder(Integer miktar) {
		System.out.println("Posta çeki ile <" + miktar
				+ "> TL para gönderilmiþtir.");
	}
}
