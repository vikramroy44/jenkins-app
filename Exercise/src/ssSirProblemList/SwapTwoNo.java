package ssSirProblemList;

import java.util.Scanner;

public class SwapTwoNo {
   static void xORSwap(int a , int b) {
	   a = a^b;
	   b = a^b;
	   a = a^b;
	   
	   System.out.println("After  XOR Swaping:  a=" + a + ", b="+ b);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method 
    //Using Third Variable
	/*
	 * int x= 5, y =7, z=0; System.out.println("Before Swaping: x = "+ x + ", Y ="+
	 * y); z=x; x=y; y=z; System.out.println("After Swaping: x = "+ x + ", Y ="+ y);
	 */
	
//Swaping Without Third Variable
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Both Number for Swapping");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
	//int a = 7, b=9;
   System.out.println("Before Swaping:  a=" + a + ", b="+ b);
   xORSwap(a, b);
   a= a+b; //16 
   b = a-b; //7
   a=  a-b;
   System.out.println("After  Swaping:  a=" + a + ", b="+ b);
   
	
	}
	
}
