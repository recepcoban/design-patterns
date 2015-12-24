package dp.behavioral.visitor;

public class CalismaPlaniZiyaretcisi implements PersonelZiyaretcisi {
	@Override
	public void ziyaretEt(Isci isci) {
		System.out.println("���i �al��ma saatleri hesapland�.");
	}

	@Override
	public void ziyaretEt(Yonetici yonetici) {
		System.out.println("Y�netici �al��ma saatleri hesapland�.");
	}
}
