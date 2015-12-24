package dp.creational.abstractfactory;

public class Sms implements IBildirim {
	@Override
	public void mesajGonder(String mesaj) {
		System.out.println("Sms ile <" + mesaj + "> içeriði gönderilmiþtir.");
	}
}
