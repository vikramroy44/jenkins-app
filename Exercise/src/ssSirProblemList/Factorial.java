package ssSirProblemList;

public class Factorial {
     public static int factorialFind(int n) {
    	// int num=1;
    	 int fact=1;
    	for(int i = n; i>=1; i  --) {
    		fact = fact*i;
    	}
    	return fact;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int fact = factorialFind(6);
      System.out.println(fact);
	}

}
