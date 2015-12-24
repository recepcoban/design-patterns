package dp.creational.factorymethod;

public class FactoryMethodImpJPEG implements FactoryMethodInterface {
	@Override
	public void resimOlustur(Integer uzunluk, Integer genislik) {
		System.out.println(uzunluk + "x" + genislik
				+ " boyutlar�nda JPEG format�nda resim olu�turuldu.");
	}
}
