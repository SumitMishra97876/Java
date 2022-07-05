package assignment_capg_bench;

import java.util.List;

public interface EmployeeService {
	
	void addEmployee(Employee emp);
	
	void addAllEmployee(List<Employee> listemp);
	
	void updateEmployee(int empId,Employee emp);
	
	void getEmployee(int empid) throws EmployeeNotFoundExecption;
	
	void getAllEmployee();
	
	void deleteEmployee(int empId) throws EmployeeNotFoundExecption ;

}
