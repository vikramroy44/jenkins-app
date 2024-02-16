package ssSirProblemList;

public class Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a =12, b =12, c=14;
     int max=0;
		
		 if(a>= b && a>=c) {
			 max=a;
			 System.out.println(max);
		 }else if(b>=a && b>=c) {
			 max =b;
			 System.out.println(max);
		 }else {
			 max= c;
			 System.out.println(max);
		 }
    
	}
}
