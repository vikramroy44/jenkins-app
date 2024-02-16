package java8;

import java.util.ArrayList;
import java.util.Comparator;

public class ListStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(2);
		list.add(5);
		list.add(7);
		list.add(4);
		list.add(3);
		
		//list.stream().sorted().forEach(t-> System.out.println(t));
		list.stream().sorted(Comparator.reverseOrder()).forEach( t -> System.out.println(t));;
		System.out.println(list);
		list.sort((o1, o2) ->  o2.compareTo(o1));
		System.out.println(list);
	}

}
