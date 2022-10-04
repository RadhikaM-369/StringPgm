package targetNum;

import java.util.Scanner;

public class LargestWord {

	 static void LongestWordLength(String str)
	    {
	        String[] words = str.split(" ");
	        String largest = words[0];
	        for (int i = 1; i < words.length; i++)
			{
			String currentWord = words[i];
			if (currentWord.length() > largest.length())
			{
			largest = currentWord;
			}
			}
	        System.out.println(" The largest word from the sentence is : "+largest+", Size is : "+largest.length());
	      }
	     
	      public static void main(String args[])
	    {
	        String str = "U r a magician";	         
	        LongestWordLength(str);
	    }
	
		
	/*
	public static void main(String[] args) {

        System.out.println();
        Scanner sc = new Scanner( System.in );
String line;
String largest;
String currentWord;
String wordsLine[];

System.out.println("Please enter the line of text : ");
line = sc.nextLine();

line = line.trim();
if (line.equals( "" ))
{
System.out.println("You have not entered a any words....");
return;
}

wordsLine = line.split(" ");
largest = wordsLine[0];
for (int i = 1; i < wordsLine.length; i++)
{
currentWord = wordsLine[i];
if (currentWord.length() > largest.length())
{
largest = currentWord;
}
}
  System.out.println( "The largest word is : " + largest + ", with  a length of: " + largest.length());
}
*/
}
