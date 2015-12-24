package dp.behavioral.visitor;

public class MaasHesaplamaZiyaretcisi implements PersonelZiyaretcisi {
	@Override
	public void ziyaretEt(Isci isci) {
		System.out.println("Ýþçi maaþý hesaplandý.");
	}

	@Override
	public void ziyaretEt(Yonetici yonetici) {
		System.out.println("Yönetici maaþý hesaplandý.");
	}
}
