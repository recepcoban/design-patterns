package dp.behavioral.visitor;

public class Yonetici implements Personel {
	@Override
	public void kabulEt(PersonelZiyaretcisi ziyaretci) {
		ziyaretci.ziyaretEt(this);
	}
}
