package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> emp = new ArrayList<Employee>();

		emp.add(new Employee(101, "Vijay", "EC", 50000));
		emp.add(new Employee(100, "Ajay", "BC", 35000));
		emp.add(new Employee(102, "BIkash", "CE", 25000));
		emp.add(new Employee(104, "Ekta", "AC", 30000));

		//List<Integer> collect = emp.stream().filter(e -> e.getId() % 2 == 0).map(e -> e.getId())
		//		.collect(Collectors.toList());

		//System.out.println(collect);
		
		 Collections.sort(emp, (o1, o2) ->(int) (o1.getSalary() - o2.getSalary()));
		 System.out.println(emp);
		 
		 Collections.sort(emp, new Comparator<Employee>() {
		 
		 @Override public int compare(Employee o1, Employee o2) { // TODO
		// Auto-generated method stub 
		 return o2.getName().compareToIgnoreCase(o1.getName());
		 
		 }
		 
		 });
		 
		 System.out.println(emp);
		 
	}

}
