package collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//default sixe of ArrayList is 10 
		//AList doesnot support Primitive data Type to use primitivr datat type use Wrapper class like Integer... 
		
		List<Integer> list = new ArrayList<>();
             list.add(1);
             list.add(2);
             list.add(3);
             list.add(4);
             list.add(5);
             System.out.println(list);
             
           List<Integer> list2 = new ArrayList<>(list);
           list2.add(6);
           list2.add(7);
           System.out.println(list2);
            List<Integer> list3 = new ArrayList<>();
            list3.add(8);
            list3.add(9);
            list3.add(10);
            
            list2.addAll(list3);
            System.out.println(list2);
             
	}

}
