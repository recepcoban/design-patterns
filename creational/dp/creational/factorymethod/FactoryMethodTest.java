package dp.creational.factorymethod;

public class FactoryMethodTest {

	public static void main(String[] args) {
		Integer uzunluk = 10;
		Integer genislik = 2;

		ResimFormatiSecici resimFormatiSecici = new ResimFormatiSecici();

		FactoryMethodInterface factoryMethodInterface = resimFormatiSecici
				.formatAl(uzunluk, genislik);
		factoryMethodInterface.resimOlustur(uzunluk, genislik);
	}

}
