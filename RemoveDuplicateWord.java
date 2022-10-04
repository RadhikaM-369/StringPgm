package targetNum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveDuplicateWord {

	public static void main(String[] args) throws IOException{
		String input="";     //String to be inputted according to user  
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter the sentence: ");
	    input= br.readLine();
	    String[] words=input.split(" ");      //Splitting every word in the sentence with the help of spaces
	    for(int i=0;i<words.length;i++)    //Outer loop for Comparison and to check if sentence is empty or not    
	    {
	      if(words[i]!=null)
	      {
	      
	      for(int j=i+1;j<words.length;j++)          //Inner loop to compare two words in a sentence to check for duplicacy
	      {
	        
	      if(words[i].equals(words[j]))          //Checking if both the compared strings are equal
	        {
	          words[j]=null;      //Deletes the duplicate words if the compared strings are equal
	        }
	      }
	      }
	    }
	    for(int k=0;k<words.length;k++)    //Displaying the String without the duplicate words  
	    {
	      if(words[k]!=null)
	      {
	        System.out.print(words[k] + " ");
	      }
	      
	    }

	}

}
