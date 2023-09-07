package collectionHashMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionDemo {
	public static void main(String args[]) {
		
		Map<Integer,String> hashMap = new HashMap<>();
		Collection<String> arrayList = new ArrayList<>();
		hashMap.put(1, "One");
		hashMap.put(2,"Two");
		hashMap.put(3,"Three");
		hashMap.put(4, "Three");
		hashMap.put(5, "Five");
		System.out.println(hashMap);
		hashMap.put(3, null);
		System.out.println(hashMap);
		System.out.println(hashMap.isEmpty());
		System.out.println(hashMap.containsValue("Three"));
		System.out.println(hashMap.replace(5, "Six"));
		arrayList = hashMap.values();
		System.out.println(arrayList);
		System.out.println(hashMap.get(4));
		
		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key + ":" + val);
			
		}
		 Set<Map.Entry<Integer, String>> set = hashMap.entrySet();
		 Iterator<Entry<Integer, String>> iter = set.iterator();
		 while(iter.hasNext()) {
			 Entry<Integer, String> entry = iter.next();
			 System.out.println(entry.getKey()+ ":"+ entry.getValue());
		 }
		 System.out.println("************************************");
		 hashMap.forEach((k,v)->{
			 System.out.println(k + ": "+ v);
		 });
	}

}
