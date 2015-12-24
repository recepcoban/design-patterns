package dp.behavioral.command;

public class LambaButton {
	private final Command acma;
	private final Command kapatma;

	public LambaButton(Command acma, Command kapatma) {
		this.acma = acma;
		this.kapatma = kapatma;
	}

	public void lambaAc() {
		this.acma.calistir();
	}

	public void lambaKapat() {
		this.kapatma.calistir();
	}
}
