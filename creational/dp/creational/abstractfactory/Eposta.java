package dp.creational.abstractfactory;

public class Eposta implements IBildirim {
	@Override
	public void mesajGonder(String mesaj) {
		System.out
				.println("Eposta ile <" + mesaj + "> içeriði gönderilmiþtir.");
	}
}
