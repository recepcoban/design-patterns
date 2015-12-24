package dp.creational.builder;

public class Builder {
	private final double price;
	private final String color, brand;
	private final int year;
	private final boolean isSecondHand;

	public static class BuilderInner {
		private final double price;
		private String color, brand;
		private int year;
		private boolean isSecondHand;

		public BuilderInner(double price) {
			this.price = price;
		}

		public BuilderInner setColor(String color) {
			this.color = color;
			return this;
		}

		public BuilderInner setBrand(String brand) {
			this.brand = brand;
			return this;
		}

		public BuilderInner setYear(int year) {
			this.year = year;
			return this;
		}

		public BuilderInner secondHand(boolean isSecondHand) {
			this.isSecondHand = isSecondHand;
			return this;
		}

		public Builder build() {
			return new Builder(this);
		}

	}

	private Builder(BuilderInner builder) {
		this.price = builder.price;
		this.brand = builder.brand;
		this.color = builder.color;
		this.isSecondHand = builder.isSecondHand;
		this.year = builder.year;
	}

	@Override
	public String toString() {
		return "Price : " + this.price + "\n" + 
				"Brand : " + this.brand + "\n" + 
				"Second : " + this.isSecondHand + "\n" + 
				"Color : " + this.color + "\n" + 
				"Year : " + this.year;
	}
}
