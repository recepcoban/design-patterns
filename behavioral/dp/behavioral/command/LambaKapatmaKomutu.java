package dp.behavioral.command;

public class LambaKapatmaKomutu implements Command {
	private final Lamba lamba;

	public LambaKapatmaKomutu(Lamba lamba) {
		this.lamba = lamba;
	}

	@Override
	public void calistir() {
		this.lamba.turnOff();
	}
}
