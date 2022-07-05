package comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import collection.Employee;

public class EmployeeExecutor {
  
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list=new ArrayList<>(Arrays.asList(
		new Employee(1001,"abc",100000),
		new Employee(1002,"abc",10000),
		new Employee(1003,"abc",150000),
		new Employee(1004,"abc",18000)));
		list.forEach(emp->System.out.println(emp));
		Collections.sort(list, new SalaryComparator());
		System.out.println("**********************************8");
		list.forEach(emp->System.out.println(emp));

		 }
}
