package dp.behavioral.state;

public class AltinHesap implements HesapDurumu {
	@Override
	public void faizOde() {
		System.out.println("Altın hesaptan faiz ödendi.");
	}

	@Override
	public void paraCek() {
		System.out.println("Altın hesaptan para çekildi.");
	}
}
