package dp.creational.singleton;

public class Singleton {

	private static Singleton object = new Singleton();
	private static int count = 0;
	private final String name;

	private Singleton() {
		count++;
		this.name = "Singleton - " + count;
	}

	public static Singleton getInstance() {
		return object;
	}

	public void printName() {
		System.out.println(this.name);
	}

}
