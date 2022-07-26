package lambda_expressions;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSort {

	public static void main(String[] args) {

		
		Employee e1=new Employee("Sumit",120,100000);
		Employee e2=new Employee("Rahul",125,700000);
		Employee e3=new Employee("Murg",189,800000);
		Employee e4=new Employee("Sunniya",200,1550000);
		Employee e5=new Employee("Natua",147,600000);
		Employee e6=new Employee("Ganeshwa",159,200000);
		
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		emplist.add(e5);
		emplist.add(e6);
		
		//before sorting
		
		System.out.println(emplist);
		
		//after sorting on empid
     
		Collections.sort(emplist,Collections.reverseOrder((p1,p2)->(p1.getEmpid()<p2.getEmpid())?-1:(p1.getEmpid()>p2.getEmpid())?1:0));
		
		
		Collections.sort(emplist,Collections.reverseOrder((p1,p2)->(p1.getSalary()<p2.getSalary())?-1:(p1.getSalary()>p2.getSalary())?1:0));
		System.out.println(emplist);

	}

}
