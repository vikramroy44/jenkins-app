package ssSirProblemList;

public class AreaOfCircle {
     public double areaCircle(double r, int n) {
    	 double area = Math.PI*r*r;
    	double ar =  Math.round(area * Math.pow(10, n))/Math.pow(10, n);
    	return ar;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfCircle circle = new AreaOfCircle();
		int round =2;
       double area = circle.areaCircle(2.3, round);
       System.out.println("Circle Area :" + area);
	}

}
