package targetNum;

public class CheckArmstrongNum {

	public static void main(String[] args) {
		  int c=0,a,temp;  
		   int n=16342;//It is the number to check Armstrong  
		   temp=n;  
		   while(n>0)  
		   {  
		   a=n%10;  
		   n=n/10;  
		    c=c+(a*a*a*a*a);  
		    }  
		    if(temp==c)  
		    System.out.println("armstrong number");   
		    else 
		        System.out.println("Not armstrong number");  	

	}

}
