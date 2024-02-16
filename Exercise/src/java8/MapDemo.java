package java8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Map<Integer,String> map = new HashMap<>();
   
   map.put(1, "Aman");
   map.put(2,"Binay");
   map.put(3, "sANJAY");
   map.put(4, "Vijay");
   
   map.entrySet().stream().filter(t -> t.getKey() %2 ==0).forEach(obj -> System.out.println(obj.getValue()));
	}

}
