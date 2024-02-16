package ssSirProblemList;

public class DigitSum {
public static int sumOfDigit(int num) {
	int temp = num;
	int sum = 0;
	int count = 0;
	while (num!=0) {
		sum =sum + num%10;
		count++;
		num = num/10;
	}
	System.out.println("Number of Digits in "+ temp + " is: "+ count);
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumOfDigit = sumOfDigit(576);
		System.out.println(sumOfDigit);

	}

}
