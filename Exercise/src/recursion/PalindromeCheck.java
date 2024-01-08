package recursion;

import java.util.*;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter your String");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		System.out.println("Your Enterd String is : "+ word);
		
		word = word.toLowerCase();
		
		String revword = "";
		
		for(int i=word.length()-1; i>=0; i--) {
			revword = revword + word.charAt(i);
		}
        
		if(word.equals(revword)) {
			System.out.println("Entered String is a Palindrome");
		}else {
			System.out.println("String is Not a Palindrome");
		}
	}

}
