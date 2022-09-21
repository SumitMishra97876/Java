package assignment_capg_bench;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EmployeeExecutor {

	public static void main(String[] args) throws EmployeeNotFoundExecption {
		
		
		EmployeeService service=new EmployeeServiceImpl();
		
		
        
		Employee e1=new Employee(3,"Sunil",80000,"Physics","Maths");
        
        service.addEmployee(e1);
        
        //service.getAllEmployee();
        
        //service.deleteEmployee(3);
        
        //service.getAllEmployee();
        
//        List<Employee> list=new ArrayList<>(Arrays.asList(
//        		             new Employee(3,"Sunil",80000,"Physics"),
//        		             new Employee(4,"Rajiv",75000,"Angular")
//        		
//        		
//        		));
//        service.addAllEmployee(list);
//        
//        service.getAllEmployee();
//        
//        service.updateEmployee(4, new Employee(4,"Rajiv",60000,"Angular","Wipro"));
//        
//        service.getAllEmployee();
//		      Scanner sc=new Scanner(System.in);
//     	      int eid=sc.nextInt();
//        
////                  System.out.println("Enter empid");
//                  Scanner sc=new Scanner(System.in);
//                   int eid=sc.nextInt();
////               
				//service.getEmployee(eid);
               
              //service.deleteEmployee(eid);
			
		       //service.getEmployee(eid);
              // service.getAllEmployee();
            // service.deleteEmployee(1);
             //service.getAllEmployee();
             
             //service.deleteEmployee(eid);
             service.getAllEmployee();
	}

}
