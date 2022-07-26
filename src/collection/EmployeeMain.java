package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {


		
	ArrayList<Employee> empList=new ArrayList<Employee>();
	
	Employee e1=new Employee(123,"Sumit",100,30);
	Employee e2=new Employee(145,"Rahul",300,31);
	Employee e3=new Employee(345,"Sunil",500,29);
	Employee e4=new Employee(567,"tinku",400,33);
	Employee e5=new Employee(900,"Natua",700,28);
	
	
	empList.add(e1);
	empList.add(e2);
	empList.add(e3);
	empList.add(e4);
	empList.add(e5);
	
   List<Employee>elist= empList.stream().map(e-> {
    	if(e.getAge()<30)
    	{
    		e.setSal(e.getSal()*1.10);
    		
    	}
    	
    	return e;
    	
    }).collect(Collectors.toList());
	
	System.out.println(elist);
	}

}
