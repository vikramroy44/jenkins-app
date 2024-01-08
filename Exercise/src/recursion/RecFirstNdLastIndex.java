package recursion;

public class RecFirstNdLastIndex {
    
	 static int first = -1;
	 static int last = -1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "mnomnomnon";
		firstLastIndex(str, 0, 'n');
	}

	private static void firstLastIndex(String str, int index, char ch) {
		// TODO Auto-generated method stub
		if(index == str.length()) {
			System.out.println(first);
			System.out.println(last);
			return;
		}
		if(str.charAt(index) == ch) {
			if(first==-1) {
			first = index;
			}
			else {
			last = index;
			}
			firstLastIndex(str, index + 1, ch);
		}else {
			firstLastIndex(str, index + 1, ch);
		}
		
		
	}

}
