package dp.behavioral.state;

public class Hesap {

	private HesapDurumu hesapDurumu;

	public Hesap() {
		this.hesapDurumu = new NormalHesap();
	}

	public void paraCek() {
		this.hesapDurumu.paraCek();
	}

	public void faizOde() {
		this.hesapDurumu.faizOde();
	}

	public void durumDegistir(final HesapDurumu hesapDurumu) {
		this.hesapDurumu = hesapDurumu;
	}
}
