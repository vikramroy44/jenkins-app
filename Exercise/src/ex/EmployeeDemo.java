package ex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "ABCD", 5000));
		list.add(new Employee(5,"EFGH" , 6000));
		//list.add(new Employee(2, "TEST", 7000));
		list.add(new Employee(3, "IJKL", 8000));
		//list.add(new Employee(4, "MNP", 9000));
		list.add(new Employee(2, "TEST", 7000));
		
		System.out.println(list);
		
//		list.stream().map(e -> {if(e.getId()>1) { 
//			e.setSalary(e.getSalary()*1.10);
//			//return e;
//		
//		} return e;
//	}
//		);
		
		List<Employee> collect = list.stream().map(e-> {
			if(e.getId()>1) {
				e.setSalary(e.getSalary()*1.10);
				//return e;
			}
			return e;
		}).collect(Collectors.toList());
		
		System.out.println(collect);
		
		System.out.println("********************************");
		List<Employee> collect2 = list.stream().filter(n -> n.getSalary()>5000).filter(n-> n.getId()>2).collect(Collectors.toList());
		System.out.println(collect2);
		

	}

}
