package dp.behavioral.visitor;

public class Sirket {
	public static void main(String[] args) {
		Isci isci = new Isci();
		Yonetici yonetici = new Yonetici();

		PersonelZiyaretcisi maasHesaplama = new MaasHesaplamaZiyaretcisi();
		PersonelZiyaretcisi calismaPlani = new CalismaPlaniZiyaretcisi();

		isci.kabulEt(maasHesaplama);
		yonetici.kabulEt(maasHesaplama);

		isci.kabulEt(calismaPlani);
		yonetici.kabulEt(calismaPlani);
	}
}
