package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfEvenOdd {
	
	public static void main(String [] args) {
		
	List<Integer> list=	Arrays.asList(3,5,6,7,8,9,12,15);
	
	List<Integer> collect = list.stream().filter(n->n%2==0).collect(Collectors.toList());
	collect.stream().forEach(n -> n=n+n);
	}

}
