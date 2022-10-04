package targetNum;

public class RemoveWhiteSpaceFromString {

	public static void main(String[] args) {
	// using replace()
		String str1="Shree is working as Quality Analyst    since from             2018";
	/*	String str2=str1.replaceAll("\\s", "");
		System.out.println(str2);*/
		
	// without replace()
		
		char[] chars = str1.toCharArray();
		StringBuffer sb = new StringBuffer();
        for (int i = 0; i <chars.length; i++)
        {
            if( (chars[i] != ' ') && (chars[i] != '\t') )
            {
                sb.append(chars[i]);
            }
        } 
        System.out.println(sb);
	}
}
