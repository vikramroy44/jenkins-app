package java8.employee;

import java.util.ArrayList;

public class MaleAndFemale {
	public static void main(String [] args) {
		
		ArrayList<Employee> list = new ArrayList<>();
		
		list.forEach(e -> System.out.println(e));
	}

}
