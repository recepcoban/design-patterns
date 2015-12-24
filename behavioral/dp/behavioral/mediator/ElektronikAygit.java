package dp.behavioral.mediator;

public abstract class ElektronikAygit {

	protected Mediator arabulucu;

	public ElektronikAygit(Mediator arabulucu) {
		this.arabulucu = arabulucu;
	}

	public abstract void calistir();

	public abstract void durdur();
}
