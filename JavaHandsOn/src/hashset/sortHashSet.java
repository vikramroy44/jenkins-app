package hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class sortHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                    Set<Employee> set = new HashSet<>();
                    set.add(new Employee(101, "Amit", "ECE", 10000));
                    //set.add(new)
                    Employee e1 = new Employee(102, "Vijay", "CSE", 20000);
                    set.add(e1);
                    set.add(new Employee(103, "Bikas", "CIVIL", 5500));
                    
                    System.out.println(set);
                    
                    //on order to sort set we have to convert it into list or treeset
                    
                    List<Employee> list = new ArrayList<Employee>(set);
                    
                    Collections.sort(list, new Comparator<Employee>() {

						@Override
						public int compare(Employee o1, Employee o2) {
							// TODO Auto-generated method stub
							return (int) (o1.getId() - o2.getId());
						}
					});
                    
                    System.out.println(list);
                    List<Employee> emplist = new ArrayList<Employee>(set);
                    
                    Collections.sort(emplist, (o1, o2)-> o1.getName().compareToIgnoreCase(o2.getName()));
                    
                    System.out.println(emplist);
                    
                    HashSet<Employee> hashSet = new HashSet<Employee>(emplist);
                    System.out.println(hashSet);
                  
	}

}
