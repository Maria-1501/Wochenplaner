package data;

import java.util.Scanner;

public class Input {

	static Scanner scan = new Scanner(System.in);

	public static String inputText(String message) {
		System.out.println(message);
		scan.nextLine();
		String inputText = scan.nextLine();
	

		return inputText;

	}

	public static int inputInt(String message) {

		System.out.println(message);
		int inputInt = scan.nextInt();

		return inputInt;

	}

}
