package dp.creational.abstractfactory;

public class PostaCeki implements IOdemeTipi {
	@Override
	public void paraGonder(Integer miktar) {
		System.out.println("Posta �eki ile <" + miktar
				+ "> TL para g�nderilmi�tir.");
	}
}
