package streams;

public class Employee {
	
	
	private String name;
	private String city;
	private String hobby;
	private int salary;
	private int id;
	private int deptid;
	private boolean status;
	
	
	public Employee(String name, String city,String hobby,int salary,int id,int deptid,boolean status) {
		super();
		this.name = name;
		this.city = city;
		this.hobby=hobby;
		this.salary=salary;
		this.id=id;
		this.deptid=deptid;
		this.status=status;
		
	}
	
	
	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", hobby=" + hobby + ", salary=" + salary + ", id=" + id
				+ ", deptid=" + deptid + ", status=" + status + "]";
	}
	
	
	

}
