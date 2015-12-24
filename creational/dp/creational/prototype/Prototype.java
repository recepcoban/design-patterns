package dp.creational.prototype;

public class Prototype implements Cloneable {
	private final String renk;
	private final Integer boy;
	private final Integer en;

	public Prototype(String renk, Integer boy, Integer en) {
		this.renk = renk;
		this.boy = boy;
		this.en = en;
	}

	@Override
	public Prototype clone() throws CloneNotSupportedException {
		try {
			return (Prototype) super.clone();
		} catch (final CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public String toString() {
		return "Renk : " + this.renk + "\n" + "Boy : " + this.boy + "\n"
				+ "En : " + this.en;
	}
}
