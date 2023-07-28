package hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HashSet hands on");
            Set<String> set = new HashSet<>();
            set.add("Ram");
            set.add("Two");
            set.add("Three");
            set.add("Four");
            System.out.println(set);
            boolean add = set.add("Five");
            System.out.println(add);
            System.out.println(set);
            
            Set<String> hashSet = new HashSet<>();
            hashSet.add("Six");
            hashSet.add("Seven");
            hashSet.add("Eight");
            
            System.out.println("New HashSet: " + hashSet);
            hashSet.addAll(set);
            System.out.println(hashSet);
            
            Set<String> newset = new HashSet<>();
            newset.add("Two");
            newset.add("Four");
            hashSet.removeAll(newset);
            System.out.println(hashSet);
	}

}
