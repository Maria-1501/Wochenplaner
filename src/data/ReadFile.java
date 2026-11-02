package data;

import java.io.FileWriter;
import java.io.IOException;

public class ReadFile {
	
	public static void readfile() {
		int nummer = Input.inputInt("Gib Nummer");
		String aufgabe = Input.inputText("Gib Aufgabe");

		try (FileWriter fileWriter = new FileWriter("aufgabe.csv", true)) {
			fileWriter.write(nummer + ";" + aufgabe + "\n");

			System.out.println("Gespeichert");

		} catch (IOException e) {
			System.out.println("Feller");

		}
	}

}
