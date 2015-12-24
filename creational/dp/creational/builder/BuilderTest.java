package dp.creational.builder;

public class BuilderTest {

	public static void main(String[] args) {
		Builder object = new Builder.BuilderInner(1000).setBrand("Hello")
				.secondHand(true).setColor("Blue").setYear(2015).build();

		System.out.println(object);
	}
}
