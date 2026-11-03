package dataHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import data.Input;
import data.Tagesplan;

public class CSVdataManager implements DataManager {
@Override
	public void save(Tagesplan plan) {
	
		int nummer = Input.inputInt("Gib Nummer");
		String aufgabe = Input.inputText("Gib Aufgabe");

		try (FileWriter fileWriter = new FileWriter("aufgabe.csv", true)) {
			fileWriter.write(nummer + ";" + aufgabe + "\n");

			System.out.println("Gespeichert");

		} catch (IOException e) {
			System.out.println("Feller");

		}

	}
@Override
	public ArrayList<Tagesplan> leseAlleAufgaben() {

		ArrayList<Tagesplan> liste = new ArrayList<Tagesplan>();

		try (BufferedReader br = new BufferedReader(new FileReader("aufgabe.csv"))) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("Error reading file.");
		}

		return liste;
	}
}
