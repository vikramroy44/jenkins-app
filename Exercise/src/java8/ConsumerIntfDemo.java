package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerIntfDemo {
	
	public static void main(String [] args) {
		
	Consumer<Integer> cons	=(t) ->{
			System.out.println("Printing :" + t);
		};
		
		//cons.accept(5);
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5,6);
		//list.stream().forEach(cons);
		list.stream().forEach(t -> System.out.println("printing value of T: "+ t));
	}

}
