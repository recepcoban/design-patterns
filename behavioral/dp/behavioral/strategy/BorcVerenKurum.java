package dp.behavioral.strategy;

public class BorcVerenKurum {
	private final Strategy strategy;

	public BorcVerenKurum(Strategy strategy) {
		this.strategy = strategy;
	}

	public void borcHesapla() {
		this.strategy.borcHesapla();
	}
}
