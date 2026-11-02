package data;



import java.io.IOException;


public class Main {

	public static void main(String[] args) throws IOException {
		InputAufgabe input = new InputAufgabe();
		System.out.println("Wenn weiter möchstest zum löschen drück 0");
		InputAufgabe.inputAufgabe();

		ZeigAufgabe zeigAufgabe = new ZeigAufgabe();
        ZeigAufgabe.zeigAufgabe();
        
		DeleteLine readLine = new DeleteLine();
		int nummer = Input.inputInt("Udalite nomer zadaniy");
		DeleteLine.deleteByNummer(nummer);
	}

}