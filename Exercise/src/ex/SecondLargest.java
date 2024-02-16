package ex;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] num = {2,4,5,6,7,8,8, 7, 9};
        
        int largest = 0;
        int secondlagest  = 0;
        
        int smallest = Integer.MAX_VALUE;
        int secSmall = Integer.MAX_VALUE;
        
        for(int i = 0; i<num.length; i++) {
        	if(num[i]> largest) {
        		secondlagest= largest;
        		largest = num[i];
        	}
        }
        System.out.println(largest);
        System.out.println(secondlagest);
        
        for(int i = 0; i<num.length; i++) {
        	if(num[i] <smallest ) {
        		secSmall = smallest;
        		smallest = num[i];
        	}
        	if(smallest <num[i] && secSmall>num[i] ){
        		
        		secSmall = num[i];
        	}
        	
        	
        }
        System.out.println(secSmall);
	}

}
