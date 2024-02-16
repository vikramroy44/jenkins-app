package ssSirProblemList;

import java.time.Year;

public class CheckLeapYr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year = 2002;
		/*
		 * String result =(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ?
		 * ("LEAP Year") :("Not A Leap Year"); System.out.println("Ternary Result: " +
		 * result);
		 */
      boolean leap = Year.isLeap(year);
      System.out.println(leap);
 
		if((year%400==0) ||((year %4 ==0) && (year%100 !=0))) {
			System.out.println(year +  " is Leap Year ");
		}
		else
			System.out.println(year +  " is  NOT a Leap Year ");
		
		

	}

}
