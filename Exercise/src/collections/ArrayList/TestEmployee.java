package collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> list = new ArrayList<>();	
		list.add(new Employee(101, "Vijay", 2500.00));
		list.add(new Employee(102, "Ajay", 3550.00));
		list.add(new Employee(103, "Sanja",2200.055));
		
		System.out.println(list);
		list.forEach(e->{
			System.out.println(e.getName());
		});
		/*
		 * Collections.sort(list, new Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee o1, Employee o2) { // TODO
		 * Auto-generated method stub return (int) (o1.getSalary() - o2.getSalary()); }
		 * });
		 */
       
       //System.out.println(list);
       
   Collections.sort(list,(o1, o2)->
	  // o2.getId() - o1.getId());
   //o2.getName().compareTo(o1.getName()));
      (int) (o2.getSalary() -o1.getSalary()));
    	// int() (o1.getSalary() - o2.getSalary()));
   System.out.println(list);
	}

}
