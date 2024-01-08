package recursion;

public class isSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,2,3,4,5};
		boolean result = isSorted(arr, 0);
		if(result) {
			System.out.println(result +"  Array is sorted");
		}else {
			System.out.println(result +"  Array is Unsorted");
		}

	}

	private static boolean isSorted(int[] arr, int i) {
		// TODO Auto-generated method stub
		if(i == arr.length - 1) {
			return true;
		}
		if(arr[i]< arr[i +1]) {
			return isSorted(arr, i+1);
		}else {
			return false;
		}
		
		
	}

}
