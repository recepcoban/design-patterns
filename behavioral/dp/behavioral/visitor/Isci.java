package dp.behavioral.visitor;

public class Isci implements Personel {
	@Override
	public void kabulEt(PersonelZiyaretcisi ziyaretci) {
		ziyaretci.ziyaretEt(this);
	}
}
