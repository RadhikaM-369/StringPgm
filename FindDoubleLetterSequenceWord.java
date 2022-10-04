package targetNum;

import java.util.Scanner;

public class FindDoubleLetterSequenceWord {

	public static void main(String[] args) {
		String sentence, words[];
		int count = 0;
		boolean check = false;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any sentence: ");
		sentence = sc.nextLine().toLowerCase();
		// Find all words from given sentence
		words = sentence.split(" ");
		System.out.print("Double Letter Sequence Words are: ");
		for(int i = 0; i < words.length; i++) {
			String temp = words[i];			
			for(int j = 0; j < temp.length() - 1; j++) {
				if(temp.charAt(j) == temp.charAt(j + 1)) {
					System.out.println(temp + " ");
				count++;
				check=true;
			}
	}
	} if(check==true) 
		System.out.println("No of double letter sequence words is : "+count);
	 else
		 System.out.println("No Double Letter Sequence Words Found in The Given Sentence!");
	
	}
	}
/*
 public static void main(String[] args) {
		String sentence, words[];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any sentence: ");
		sentence = sc.nextLine().toLowerCase();
		// Find all words from given sentence
		words = sentence.split(" ");
		System.out.print("Double Letter Sequence Words are: ");
		for(int i = 0; i < words.length; i++) {
			String temp = words[i];			
			for(int j = 0; j < temp.length() - 1; j++) {
				if(temp.charAt(j) == temp.charAt(j + 1))
					System.out.print(temp + " ");
			}
	}
	}
 
 
 Enter any sentence: sequence of double letters in programm
Double Letter Sequence Words are: letters programm 
 */


