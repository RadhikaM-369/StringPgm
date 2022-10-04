package targetNum;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckSpecialCharacters {
	
	public static void main(String[] args) {
		// Declare variables
		String str;
		Scanner sc = new Scanner(System.in);
		// Accept any String
		System.out.print("Enter any String to check: ");
		str = sc.nextLine();
		String specialChars = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
		boolean check = false;
		// Use for loop to check special characters
		for (int i = 0; i < str.length(); i++) {
			String strChar = Character.toString(str.charAt(i));
			// Check whether String contains special character or not
			if (specialChars.contains(strChar)) {
				check = true;
				break;
			}
		}
		if (check)
			System.out.println("Given String contains special character!");
		else
			System.out.println("Given String doesn't contain any special characters");

	}

	
	
	
	/*public static void main(String[] args) {
		String str;
		Pattern checkPattern;
		Matcher match;
		boolean check;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any String to check: ");
		str = sc.nextLine();

		checkPattern = Pattern.compile("[^a-zA-Z0-9]");
		// Declare matcher to match with String
		match = checkPattern.matcher(str);
		// Use find( ) function to check
		check = match.find();
		// Check whether String contains any special characters or not and display
		// accordingly
		if (check)
			System.out.println("Given String contains special character!");
		else
			System.out.println("Given String doesn't contain any special characters");
	}*/
	
	
	/*public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any String to check: ");
		str = sc.nextLine();
		boolean check = false;
		// Use for loop to check special characters
		for (int i = 0; i < str.length(); i++) {
			int asciiVal = (int) str.charAt(i);
			// Check whether String contains special character or not
			if ((asciiVal >= 32 && asciiVal <= 47) || (asciiVal >= 58 && asciiVal <= 64)
					|| (asciiVal >= 91 && asciiVal <= 96) || (asciiVal >= 123 && asciiVal <= 126)) {
				check = true;
				break;
			} }
		if (check)
			System.out.println("Given String contains special character!");
		else
			System.out.println("Given String doesn't contain any special characters");
	}*/
}
