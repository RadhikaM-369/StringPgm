package targetNum;

import java.util.Scanner;

public class SwapNumUsingThirdVariable {
/*
	public static void main(String[] args) {
		int x, y, temp;
        System.out.println("Enter x and y - ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        System.out.println("Before Swapping : " + x +" "+ y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("After Swapping : " + x+" " + y);
        }*/
	//without using the third variable.
	 public static void main(String args[])
	   {
	      int x, y;
	      System.out.println("Enter x and y : ");
	      Scanner in = new Scanner(System.in);	  
	      x = in.nextInt();
	      y = in.nextInt();	  
	      System.out.println("Before Swapping : \nx = "+x+"\ny = "+y);
	      x = x + y;
	      y = x - y;
	      x = x - y;	  
	      System.out.println("After Swapping without third variable : \nx = "+x+"\ny = "+y);
	   }
}
