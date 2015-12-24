package dp.behavioral.command;

public class LambaAcmaKomutu implements Command {
	private final Lamba lamba;

	public LambaAcmaKomutu(Lamba lamba) {
		this.lamba = lamba;
	}

	@Override
	public void calistir() {
		this.lamba.turnOn();
	}
}
