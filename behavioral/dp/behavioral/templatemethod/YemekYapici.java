package dp.behavioral.templatemethod;

public abstract class YemekYapici {

	public void yemekYap() {
		malzemeHazirla();
		pisir();
		servisYap();
	}

	public abstract void malzemeHazirla();

	public abstract void pisir();

	public abstract void servisYap();
}
