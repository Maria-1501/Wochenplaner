package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ZeigAufgabe {
	
	public static void zeigAufgabe () {
		
		   try (BufferedReader br = new BufferedReader(new FileReader("aufgabe.csv"))) {
			      String line;
			      while ((line = br.readLine()) != null) {
			        System.out.println(line);
			      }
			    } catch (IOException e) {
			      System.out.println("Error reading file.");
			    }
		  
	}

	

}
