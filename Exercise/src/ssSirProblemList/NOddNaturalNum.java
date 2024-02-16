package ssSirProblemList;

public class NOddNaturalNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=7;
      int sum = 0;
      for(int i =1; i<=n; i++) {
    	  int num = (2*i -1);
    	  sum += num;
    		  System.out.println(num);
      }
      System.out.println("Sum of Odd Natural Number :" + sum);
      System.out.println("Reversed Order");
      for(int j =n; j>=1; j --) {
    	  System.out.println(2*j -1);
      }
	}

}
