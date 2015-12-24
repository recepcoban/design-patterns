package dp.creational.factorymethod;

public class FactoryMethodImpGIF implements FactoryMethodInterface {
	@Override
	public void resimOlustur(Integer uzunluk, Integer genislik) {
		System.out.println(uzunluk + "x" + genislik
				+ " boyutlarında GIF formatında resim oluşturuldu.");
	}
}
