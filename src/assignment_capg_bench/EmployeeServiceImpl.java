package assignment_capg_bench;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeData empData;
	
	public EmployeeServiceImpl()
	{
		empData=new EmployeeData();
	}
	
	

	@Override
	public void addEmployee(Employee emp) {
		
		empData.addEmployee(emp);
	}

	@Override
	public void addAllEmployee(List<Employee> listemp) {
		empData.addEmployees(listemp);
		
	}

	@Override
	public void updateEmployee(int empId, Employee emp) {
		empData.updateEmp(empId, emp);
		
	}

	@Override
	public void getEmployee(int empid) throws EmployeeNotFoundExecption {
		 empData.getEmployee(empid);
		
	}

	@Override
	public void getAllEmployee() {
		empData.getAllEmployee();
		
	}

	@Override
	public void deleteEmployee(int empId) throws EmployeeNotFoundExecption {
		empData.deleteEmployee(empId);
		
	}

}
