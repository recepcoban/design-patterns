package dp.structural.adapter;

public class Adapter implements Adres {
	private final Customer customer;

	public Adapter(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String getAdres() {
		return this.customer.getAdres();
	}

	@Override
	public String getSemt() {
		return this.customer.getSemt();
	}

	@Override
	public String getSehir() {
		return this.customer.getSehir();
	}

	@Override
	public String getUlke() {
		return this.customer.getUlke();
	}
}
