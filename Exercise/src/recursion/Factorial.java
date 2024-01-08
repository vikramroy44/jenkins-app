package recursion;

public class Factorial {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =5;
		  Factorial f  = new Factorial();
          int res = f.factor(num);
          System.out.println(res);
	}
	int fact = 1;
	private int factor(int n) {
		
		// TODO Auto-generated method stub
		if(n>1) {
			fact = fact*n;
			factor(n-1);
		}
		return fact;
	}

}
