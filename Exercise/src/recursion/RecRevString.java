package recursion;

public class RecRevString {
    static String revStr="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ABCDEF";
		int index = str.length()-1;
		String rev = revString(str, index);
        System.out.println(rev);
	}

	private static String revString(String str, int index) {
		// TODO Auto-generated method stuben
		
		if(index==0) {
			revStr = revStr +str.charAt(index);
		}else {
			revStr = revStr + str.charAt(index);
			revString(str, index-1);
		}
		return revStr;
	}
	

}
