package dp.behavioral.strategy;

public class Customer {
	public static void main(String[] args) {
		// �ki farkl� y�ntem ile bor� veren kurum nesneleri yarat�ld�.
		BorcVerenKurum kurum1 = new BorcVerenKurum(new MethodA());
		BorcVerenKurum kurum2 = new BorcVerenKurum(new MethodB());

		// Bor� hesaplamalar�
		kurum1.borcHesapla();
		kurum2.borcHesapla();
	}
}
