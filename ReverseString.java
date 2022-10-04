package targetNum;

import java.util.Scanner;

public class ReverseString {
/*
	static void reverse(char str[],int start, int end)
{
  char temp;   
  while (start <= end)
  {
    // Swapping the first & last character
    temp = str[start];
    str[start] = str[end];
    str[end] = temp;
    start++;
    end--;
  }
}
// Function to reverse words
static char[] reverseWords(char []s)
{
  // Reversing individual words as explained in the first step 
  int start = 0;
  for (int end = 0; end < s.length; end++)
  {
    // If we see a space, we reverse the previous word (word between the indexes start and end-1 i.e., s[start..end-1]
    if (s[end] == ' ')
    {
      reverse(s, start, end);
      start = end + 1;
    }
  } 
  // Reverse the last word
  reverse(s, start, s.length - 1);
  //i ekil siht margorp yrev hcum
 
  // Reverse the entire String
 // reverse(s, 0, s.length - 1);
  //o/p: much very program this like i 
  return s;
}
public static void main(String[] args)
{
  String s = "i like this program very much ";
  char []p = reverseWords(s.toCharArray());
  System.out.print(p);
}
}*/
//reverse a string without using String inbuilt function.
/*
	public static void main(String[] args) {
    // TODO Auto-generated method stub
    String str = "Automation Lab";
    StringBuilder str2 = new StringBuilder();
    str2.append(str);
    str2 = str2.reverse();     // used string builder to reverse
   System.out.println(str2);
    }
*/
//string without using String inbuilt function reverse().
/*public static void main(String[] args) {
    String str = "Saket Saurav";
    char chars[] = str.toCharArray();  // converted to character array and printed in reverse order
    for(int i= chars.length-1; i>=0; i--) {
        System.out.print(chars[i]);
    }
}*/
// without using String inbuilt function reverse() but split()
/*	 public static void main(String[] args) {
	        String str;
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter your String");
	        str = in.nextLine();
	        String[] token = str.split("");    //used split method to print in reverse order
	        for(int i=token.length-1; i>=0; i--)
	        {
	            System.out.print(token[i] + "");
	        }	         
	    }*/
// charAt(index) method
	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        String original, reverse = "";
	        System.out.println("Enter the string to be reversed");
	        Scanner in = new Scanner(System.in);
	        original = in.nextLine();
	        int length = original.length();
	        for(int i=length-1; i>=0; i--) {
	            reverse = reverse + original.charAt(i);   //used inbuilt method charAt() to reverse the string
	        }
	        System.out.println(reverse);
	    }

}
