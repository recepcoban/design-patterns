package dp.creational.factorymethod;

public class ResimFormatiSecici {

	public FactoryMethodInterface formatAl(Integer uzunluk, Integer genislik) {
		Integer alan = uzunluk * genislik;
		if (alan > 100) {
			// alan 100 den buyukse format JPEG
			return new FactoryMethodImpJPEG();
		} else {
			// degilse GIF olacaktýr
			return new FactoryMethodImpGIF();
		}
	}

}
