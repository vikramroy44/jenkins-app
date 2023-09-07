package collectionHashMap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class UserDemo {
	public static void main(String[] args) {
		
//		HashMap<Integer, User> user = new HashMap<Integer,User>();
//		
//		user.put(1, new User("Vikram", "ECE", 5000));
//		user.put(2, new User("Ravi", "ITE", 10000));
//		user.put(3, new User("Abhi", "CSE", 12000));
		
//		System.out.println(user);
//		ArrayList<User> list = new ArrayList<>(user.values());
//		System.out.println(list);
//		list.sort((u1,u2) ->
//		//u2.getSalary() - u1.getSalary());
//		u1.getDepartment().compareTo(u2.getDepartment()));
//		
//		System.out.println(list);
//		
		//List<String> str=Array.asList("Apple", "Book", "Cat");
		
		ArrayList<User> list = new ArrayList<>();
		list.add(0, new User("Vikram", "ECE", 5000));
		list.add(1, new User("Ravi", "ITE", 10000));
		list.add(2, new User("Abhi", "CSE", 12000));
		System.out.println(list);
		Collections.sort(list, new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				// TODO Auto-generated method stub
				//int result = o2.getSalary() - o1.getSalary();
				int result = o1.getName().compareTo(o2.getName());
				return result;
			}
		});
		System.out.println(list);
		
		List<String> str = Arrays.asList("bbc", "acs", "cfd");
		System.out.println(str);
		Collections.sort(str);
		System.out.println(str);
		str.forEach(s ->System.out.println(s));
		
		for(String s : str) {
			System.out.println(s);
		}
		
//		list.sort((u1,u2) ->
//			//u2.getSalary() - u1.getSalary()
//		u1.getName().compareTo(u2.getName())
//		);
		 
	}

}
