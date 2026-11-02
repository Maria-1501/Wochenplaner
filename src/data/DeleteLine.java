package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DeleteLine {
	public static void deleteByNummer(int nummer) throws IOException {

//	String fileName = "aufgabe.csv";
//	List<String>lines = new ArrayList<>();

		String fileName = "aufgabe.csv";
		List<String> lines = new ArrayList<>();

		try (BufferedReader fw = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = fw.readLine()) != null) {
				String[] teil = line.split(";");
				if (teil.length > 0) {
					int currentNummer = Integer.parseInt(teil[0].trim());
					if (currentNummer == nummer) {
						continue;
					}
				}
				lines.add(line);

			}
		} catch (IOException e) {
			System.out.println("Error reading file.");
			return;

		}
		try (FileWriter writer = new FileWriter(fileName)) {
			for (String line : lines) {
				writer.write(line + "\n");

			}
			System.out.println("Gelöscht Aufgabe:" + " " + nummer);
		} catch (IOException e) {
			System.out.println("Feller");
		}

	}

	public DeleteLine() {
		super();
	}
}
