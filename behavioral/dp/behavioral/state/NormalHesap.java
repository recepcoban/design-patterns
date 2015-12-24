package dp.behavioral.state;

public class NormalHesap implements HesapDurumu {
	@Override
	public void faizOde() {
		System.out.println("Normal hesaptan faiz ödendi.");
	}

	@Override
	public void paraCek() {
		System.out.println("Normal hesaptan para çekildi.");
	}
}
