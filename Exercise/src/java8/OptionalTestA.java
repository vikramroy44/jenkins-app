package java8;

import java.util.Optional;

public class OptionalTestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Optional<Integer> num = Optional.of(25);
		Optional<Integer> optional = num.filter(x-> x%2==0);
		//System.out.println(optional.isPresent());
		Optional<Integer> optional2 = num.filter(x-> x%2==1);
		if(optional2.isPresent()) {
			System.out.println("Odd No Value");
		}else {
			System.out.println("Even No Value");
		}
	}

}
