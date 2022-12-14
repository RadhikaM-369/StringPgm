package targetNum;

public class RemoveDuplicate {

	public static void removeDuplicates(String str)   
    {   
        //Create an empty string   
        String newstr = new String();   
          
        //calculate length of the original string  
        int length = str.length();   
            
        // Traverse the string and check for the repeated characters   
        for (int i = 0; i < length; i++)    
        {   
            // store the character available at ith index in the string  
            char charAtPosition = str.charAt(i);   
                
            // check the index of the charAtPosition. If the indexOf() method returns true add it to the resuting string  
            if (newstr.indexOf(charAtPosition) < 0)   
            {   
                newstr += charAtPosition;   
            }   
        }   
        //Print string after removing duplicate characters   
        System.out.println(newstr);  
    }   
	
	public static void main(String[] args) {
		  String str = "JavaTpoint is the best learning website";   
	        //call removeDuplicates() method for removing duplicate characters    
	        removeDuplicates(str);   	

	}

}
