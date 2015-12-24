package dp.behavioral.command;

public class Kullanici {

	public static void main(String[] args) {
		Lamba lamba = new Lamba();

		LambaAcmaKomutu acmaKomutu = new LambaAcmaKomutu(lamba);
		LambaKapatmaKomutu kapatmaKomutu = new LambaKapatmaKomutu(lamba);

		LambaButton lambaButton = new LambaButton(acmaKomutu, kapatmaKomutu);
		lambaButton.lambaAc();
		lambaButton.lambaKapat();
	}

}
