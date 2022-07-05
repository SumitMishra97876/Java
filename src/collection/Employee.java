package collection;

public class Employee {
	
	int empno;
	String name;
	int sal;
	
	
	public Employee(int empno,String name,int sal)
	{
		this.empno=empno;
		this.name=name;
		this.sal=sal;
	}


	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", sal=" + sal + "]";
	}


	public int getEmpSalary() {
		// TODO Auto-generated method stub
		return this.sal;
	}
	
	
	

}
