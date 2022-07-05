package comparator;

import java.util.Comparator;

import collection.Employee;

public class SalaryComparator implements Comparator<Employee>{

	
	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if(e1.getEmpSalary()>e2.getEmpSalary())
			return 1;
			else if(e1.getEmpSalary()==e2.getEmpSalary())
			return 0 ;
			else
			return -1;
			}

	}

