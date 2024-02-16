package ssSirProblemList;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		
		/*
		 * if(n%2==0) { System.out.println(n + " is Even"); }else { System.out.println(n
		 * + " is odd"); }
		 */
      // Bit wise OR (|)
		if((n | 1) > n) {
			System.out.println(n + " is Even");
		}else
		{
			System.out.println(n + " is odd");
		}
		
		//Bit Wise And(&)
		if((n & 1) == 0) {
			System.out.println(n + " is Even");
		}else
		{
			System.out.println(n + " is odd");
		}
	}

}
