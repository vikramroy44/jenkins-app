package recursion;

public class RecMoveCh {

	//private static int count=0;
	//static String newString ="";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "axbxcxd";
		moveAllXAtEnd(str, 0, 'x', 0, "");

	}

	private static void moveAllXAtEnd(String str, int i, char ch, int count, String tempString) {
		// TODO Auto-generated method stub
		if(i ==str.length()) {
			for(int j=0; j<count; j++) {
				tempString +=ch;
			}
			System.out.println(tempString);
			return;
		}
		if(str.charAt(i)==ch) {
			count++;
			moveAllXAtEnd(str, i+1, ch, count, tempString);
		}else {
			tempString += str.charAt(i);
			moveAllXAtEnd(str, i+1, ch, count, tempString);
		}
		
	}

}
