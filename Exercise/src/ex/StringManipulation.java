package ex;

public class StringManipulation {
	public static void main(String [] args) {
		
		String str= "Vikram Kumar";
		String[] split = str.split(" ",0);
		for(String s : split) {
			System.out.println(s);
		}
		System.out.println(split[1]);
	}

}
