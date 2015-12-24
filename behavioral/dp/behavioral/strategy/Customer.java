package dp.behavioral.strategy;

public class Customer {
	public static void main(String[] args) {
		// Ýki farklý yöntem ile borç veren kurum nesneleri yaratýldý.
		BorcVerenKurum kurum1 = new BorcVerenKurum(new MethodA());
		BorcVerenKurum kurum2 = new BorcVerenKurum(new MethodB());

		// Borç hesaplamalarý
		kurum1.borcHesapla();
		kurum2.borcHesapla();
	}
}
