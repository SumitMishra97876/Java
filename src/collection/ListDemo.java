package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		Employee emp[]=new Employee[5];
		
		emp[0]=new Employee(123,"Sumit",50000);
		emp[1]=new Employee(124,"Rahul",30000);
		emp[2]=new Employee(125,"Sunil",40000);
		emp[3]=new Employee(126,"Sunny",60000);
		emp[4]=new Employee(127,"jack",80000);
//		Employee e1=new Employee(123,"Sumit",50000);
//		Employee e2=new Employee(124,"Rahul",30000);
//		Employee e3=new Employee(125,"Sunil",40000);
//		Employee e4=new Employee(126,"Sunny",60000);
//		Employee e5=new Employee(127,"jack",80000);
		
	List<Employee> a=new ArrayList<>();
	
//	a.add(e1);
//	a.add(e2);
//	a.add(e3);
//	a.add(e4);
//	a.add(e5);
	
	for(int i=0;i<emp.length;i++)
	{
		a.add(emp[i]);
	}
	System.out.println(a);
	
	}

}
