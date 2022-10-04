package targetNum;

import java.util.Scanner;

public class RemoveCharFromString {

	public static void main(String[] args) {
		String str, newStr;
		int pos;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any String: ");
		str = sc.nextLine();
		System.out.print("Enter any position of char of String you want to remove: ");
		pos = sc.nextInt();		
		newStr = str.substring(0, pos-1) + str.substring(pos, str.length());
		System.out.println("String after remove particular character: " + newStr);
	}

}
