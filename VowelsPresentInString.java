package targetNum;

import java.util.Scanner;

public class VowelsPresentInString {

	public static void main(String[] args) {
			String str = null;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter any String: ");
			str = sc.nextLine();
			str = str.toLowerCase();
			System.out.print("Vowels in the given String are:");
			// For loop to iterate String
			for (int i = 0; i < str.length(); i++) {
				// Check a character is vowel or not
				if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || 
					str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				System.out.print(" " + str.charAt(i));
				}
			}

		}
	}


