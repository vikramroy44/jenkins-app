package demo;

import java.util.Random;
import java.util.Scanner;

public class TestGame {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
        
		int num = 0;
		int pnum = 0;
		while(num<=100) {
			//Scanner sc =  new Scanner(System.in);
		System.out.println("My initial Position is " + pnum);
		int rnum= random.nextInt();
		pnum = num;
		 num =  num +rnum;
		 
		 if(num==100) {
			 System.out.println("I won");
		 }else {
		 System.out.println("My Final Position is " + num);
		 }
				
	
	}
	}
	//random num  2  4
	// pnum   0   2
	 //num    0  2  + 4
}
