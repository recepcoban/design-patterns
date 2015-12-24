package dp.behavioral.interpreter;

import java.util.ArrayList;
import java.util.List;

public class Interpreter {

	public static void main(String[] args) {
		String metin = "+-+-%%%-+%++%--+";
		List<Sembol> sembols = new ArrayList<Sembol>();

		for (char c : metin.toCharArray()) {
			if (c == '+') {
				sembols.add(new Arti());
			} else if (c == '-') {
				sembols.add(new Eksi());
			} else if (c == '%') {
				sembols.add(new Yuzde());
			}
		}

		for (Sembol sembol : sembols) {
			sembol.yorumla();
		}
	}
}
