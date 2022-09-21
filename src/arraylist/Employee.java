package arraylist;

public class Employee {
	
	String ename;
	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee(String ename, int i) {
		
		this.ename = ename;
		this.id = i;
	};
	
    public Employee() {}
}
