package dp.behavioral.templatemethod;

public class YemekSirketi {

	public static void main(String[] args) {
		YemekYapici[] yemekYapicilar = new YemekYapici[2];
		yemekYapicilar[0] = new Corba();
		yemekYapicilar[1] = new Pilav();

		for (YemekYapici yemekYapici : yemekYapicilar) {
			yemekYapici.yemekYap();
		}
	}

}
