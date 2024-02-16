package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PatternCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List<String> list =	Arrays.asList("XYZABC", "MNOPBCA", "KLMNCAB", "DFGH", "ERTY");
	List<String> list2 = list.stream().filter(e -> e.contains("ABC") || e.contains("BCA") || e.contains("CAB")).collect(Collectors.toList());
list2.forEach(l-> System.out.println(l));
	}

}
