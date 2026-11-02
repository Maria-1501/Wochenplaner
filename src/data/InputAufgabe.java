package data;

import java.io.FileWriter;
import java.io.IOException;

public class InputAufgabe {
	public static void inputAufgabe() {
		int nummer;
		String aufgabe;

		try (FileWriter fileWriter = new FileWriter("aufgabe.csv", true)) {
			nummer = Input.inputInt("Gib Nummer");
			if (nummer == 0) {
				DeleteLine.deleteByNummer(nummer);
			} else {
				aufgabe = Input.inputText("Gib Aufgabe");

				fileWriter.write(nummer + ";" + aufgabe + "\n");

			}
			System.out.println("Gespeichert");

		} catch (IOException e) {
			System.out.println("Feller");

		}
	}

}
