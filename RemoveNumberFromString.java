package targetNum;

import java.util.Scanner;

public class RemoveNumberFromString {
// using  replaceAll( ), regex and charAt( ).
	/*
	 1. replaceAll( )
	 * public static void main(String[] args) {
		String str;		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any String to remove numbers: ");
		str = sc.nextLine();		
		// Replace all numbers from given String
		str = str.replaceAll("[0123456789]", "");
		System.out.print("String after removing all numbers: " + str);
	}*/
	
	/*
	    2.regex
	    public static void main(String[] args) {
		String str, res="";		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any String to remove numbers: ");
		str = sc.nextLine();
		for(int i=0; i<str.length(); i++) {
			if(!Character.isDigit(str.charAt(i))) {
				res += str.charAt(i);
			}
		}
		System.out.print("String after removing all numbers: " + res);
	}*/
	
		
}
