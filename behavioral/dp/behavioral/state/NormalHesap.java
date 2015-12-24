package dp.behavioral.state;

public class NormalHesap implements HesapDurumu {
	@Override
	public void faizOde() {
		System.out.println("Normal hesaptan faiz �dendi.");
	}

	@Override
	public void paraCek() {
		System.out.println("Normal hesaptan para �ekildi.");
	}
}
