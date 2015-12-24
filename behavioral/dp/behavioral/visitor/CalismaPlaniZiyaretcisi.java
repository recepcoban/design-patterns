package dp.behavioral.visitor;

public class CalismaPlaniZiyaretcisi implements PersonelZiyaretcisi {
	@Override
	public void ziyaretEt(Isci isci) {
		System.out.println("Ýþçi çalýþma saatleri hesaplandý.");
	}

	@Override
	public void ziyaretEt(Yonetici yonetici) {
		System.out.println("Yönetici çalýþma saatleri hesaplandý.");
	}
}
