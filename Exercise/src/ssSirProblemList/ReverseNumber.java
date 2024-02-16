package ssSirProblemList;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 754;
      System.out.println(numberReverse(num));
	}

	private static int numberReverse(int num) {
		// TODO Auto-generated method stub
		int reverse = 0, remainder=0;
		while(num!=0) {
			remainder = num%10;
			reverse = reverse*10 + remainder;
			num= num/10;
		}
		return reverse;
	}

}
