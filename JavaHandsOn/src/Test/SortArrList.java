package Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<Integer> list = Arrays.asList(2,4,3,6,7,9,8);
      
      Stream<Integer> sorted = list.stream().sorted((o1, o2) -> o1.intValue() - o2.intValue());
       IntStream int1 = sorted.mapToInt(Integer :: valueOf);
       System.out.println(int1);
      
      
	}

}
