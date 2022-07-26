package lambda_expressions;

public class Employee {
	
	
	private String ename;
	private int empid;
	private double salary;
	
	
	public Employee(String ename,int empid,double salary)
	{
		this.ename=ename;
		this.empid=empid;
		this.salary=salary;
	}
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", empid=" + empid + ", salary=" + salary + "]";
	}
	

}
