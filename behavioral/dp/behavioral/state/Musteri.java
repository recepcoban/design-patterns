package dp.behavioral.state;

public class Musteri {
	public static void main(String[] args) {
		// Yaratýlan hesap varsayýlan olarak 'normal' durumda.
		final Hesap hesap = new Hesap();
		hesap.faizOde();
		hesap.paraCek();

		// Çalýþma zamanýnda hesap durum deðiþtiriliyor.
		// Müþteri altýn hesaba geçiriliyor.
		hesap.durumDegistir(new AltinHesap());

		System.out.println("Müþteri altýn hesaba geçiriliyor.");

		// Durum deðiþtiði için davranýþ da deðiþecek.
		hesap.faizOde();
		hesap.paraCek();
	}
}
