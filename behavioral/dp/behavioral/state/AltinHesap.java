package dp.behavioral.state;

public class AltinHesap implements HesapDurumu {
	@Override
	public void faizOde() {
		System.out.println("Alt�n hesaptan faiz �dendi.");
	}

	@Override
	public void paraCek() {
		System.out.println("Alt�n hesaptan para �ekildi.");
	}
}
