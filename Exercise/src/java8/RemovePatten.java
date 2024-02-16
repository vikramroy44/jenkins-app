package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemovePatten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("PQRVK", "MNOPVK", "ZABCD", "ABCDEF", "ANSHUVK", "VKABCD", "mnovk");
		
		List<String> collect = list.stream().map(e -> e.toUpperCase()).filter(e -> e.endsWith("VK")|| e.startsWith("VK")).collect(Collectors.toList());
		System.out.println(collect);

	}

}
