package dp.creational.prototype;

public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Prototype object1 = new Prototype("Blue", 175, 60);
		// yeni bir nesne oluþturma var olandan kopyalandý.
		Prototype object2 = object1.clone();

		System.out.println(object1);
		System.out.println(object2);
	}

}
