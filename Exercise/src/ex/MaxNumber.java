package ex;

import java.util.Arrays;
import java.util.List;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 5, 3,9,7,11,8};
		
		
		int max = arr[0];
		for(int i=1;  i<arr.length;  i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);
		
		
		List<Integer> list = Arrays.asList(3,7,5,9,8,6);
		int max1 = list.stream().sorted().mapToInt(Integer :: valueOf).min().getAsInt();
		//int1.forEach(e-> System.out.println(e));
//		int max2 = int1.max().getAsInt();
//		System.out.println(max2);
		System.out.println(max1);
	}

}
