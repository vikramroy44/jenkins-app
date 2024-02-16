package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);
         List<List<Integer>> list = Arrays.asList(list1, list2, list3);
         List<List<Integer>> collect = list.stream().collect(Collectors.toList());
         System.out.println(collect);
         List<Integer> collect2 = list.stream().flatMap(t -> t.stream()).collect(Collectors.toList());
         System.out.println(collect2);
	}

}
