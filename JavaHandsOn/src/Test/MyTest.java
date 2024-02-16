package Test;

import java.util.Arrays;
import java.util.List;

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list = Arrays.asList(3,2,5,8,7,9);
list.sort((o1, o2) -> o1.intValue() - o2.intValue());
System.out.println(list);

	}

}
