package data;

public class Tagesplan {

	int nummer;
	String aufgabe;

	public Tagesplan(int numer, String aufgabe) {
		super();
		this.nummer = numer;
		this.aufgabe = aufgabe;
	}

	public String getAufgabe() {
		return aufgabe;

	}

	public int getNumer() {
		return nummer;
	}

	@Override
	public String toString() {
		return "Tagesplan numer: " + " " + nummer + "; Aufgabe: " + " " + aufgabe;

	}
	

}
