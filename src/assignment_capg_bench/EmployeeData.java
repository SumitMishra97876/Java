package assignment_capg_bench;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class EmployeeData {
	
	
	ArrayList<Employee> array=new ArrayList<>(Arrays.asList(
			new Employee(1,"Sumit",50000,"Selenium","Java","Automation"),
			new Employee(2,"Rahul",45000,"Accounts","Commerxe"),
			new Employee(3,"Jack",67000,"Python")
			));
	
	
	public void addEmployee(Employee emp)
	{
		array.add(emp);
	}
	public void addEmployees(List<Employee> listemp)
	{
		array.addAll(listemp);
	}
    public void updateEmp(int empId,Employee emp)
    {
    	for(int i=0;i<array.size();i++)
    	{
    		if(array.get(i).getEmpId()==empId)
    		{
    			array.set(i, emp);
    		}
    	}
    }
    public void getEmployee(int empId ) throws EmployeeNotFoundExecption
    {
    	boolean flag=false;
    	try
    	{
    	for(int i=0;i<array.size();i++)
    	{
    	
    	    	if(array.get(i).getEmpId()==empId)
    	    	{
    	    		System.out.println(array.get(i));
    	    		flag=true;
    	    		break;
    	    	}
    	    	
    	   }
    	    if(flag==false)
    	    {
    	    	throw new EmployeeNotFoundExecption("No Employee exists with employee ID " + empId);
    	    }
    	}
    	catch(EmployeeNotFoundExecption ei)
    	{
    		ei.printStackTrace();
    	}
    	
    	
    	
    	
//    	Optional<Employee>optional= array.stream().filter(emp->emp.getEmpId()==empId).findFirst();
//   	   return optional.get();
    }
    
    public void getAllEmployee()
    {
    	array.forEach(e->System.out.println(e));
    }
    
    public void deleteEmployee(int empId) throws EmployeeNotFoundExecption
    {
        boolean flag=false;
        try
        {
    	for(int i=0;i<array.size();i++)
    	{
    		if(array.get(i).getEmpId()==empId)
    		{
    			array.remove(i);
    			flag=true;
    		}
    	}
    	if(flag==false)
    	{
    		throw new EmployeeNotFoundExecption("Employee with empid " + empId + " not found to delete");
    	}
        }
        catch(EmployeeNotFoundExecption e)
        {
        	e.printStackTrace();
        }
    }
}
