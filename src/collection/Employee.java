package collection;

public class Employee {
	
	int empno;
	String name;
	int age;
	int salary;
	


	public Employee(int empno, String name, double sal) {
		super();
		this.empno = empno;
		this.name = name;
		this.sal = sal;
	}


	double sal;
	
	
	public Employee(int empno,String name,double sal,int age)
	{
		this.empno=empno;
		this.name=name;
		this.sal=sal;
		this.age=age;
	}


	public int getEmpno() {
		return empno;
	}


	public void setEmpno(int empno) {
		this.empno = empno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSal() {
		return  sal;
	}


	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", sal=" + sal + "]";
	}


//	public int getEmpSalary() {
//		// TODO Auto-generated method stub
//		return this.sal;
	}
	
	
	


