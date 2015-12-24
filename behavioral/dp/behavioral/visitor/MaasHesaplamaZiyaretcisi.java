package dp.behavioral.visitor;

public class MaasHesaplamaZiyaretcisi implements PersonelZiyaretcisi {
	@Override
	public void ziyaretEt(Isci isci) {
		System.out.println("���i maa�� hesapland�.");
	}

	@Override
	public void ziyaretEt(Yonetici yonetici) {
		System.out.println("Y�netici maa�� hesapland�.");
	}
}
