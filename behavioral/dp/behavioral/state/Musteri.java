package dp.behavioral.state;

public class Musteri {
	public static void main(String[] args) {
		// Yarat�lan hesap varsay�lan olarak 'normal' durumda.
		final Hesap hesap = new Hesap();
		hesap.faizOde();
		hesap.paraCek();

		// �al��ma zaman�nda hesap durum de�i�tiriliyor.
		// M��teri alt�n hesaba ge�iriliyor.
		hesap.durumDegistir(new AltinHesap());

		System.out.println("M��teri alt�n hesaba ge�iriliyor.");

		// Durum de�i�ti�i i�in davran�� da de�i�ecek.
		hesap.faizOde();
		hesap.paraCek();
	}
}
