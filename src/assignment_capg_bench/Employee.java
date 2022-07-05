package assignment_capg_bench;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Employee {
    
	private int empId;
	private String empName;
	private float basicSal;
	private Set skillset;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getBasicSal() {
		return basicSal;
	}
	public void setBasicSal(float basicSal) {
		this.basicSal = basicSal;
	}
	public Set getSkillset() {
		return skillset;
	}
	public void setSkillset(Set skillset) {
		this.skillset = skillset;
	}
	public Employee(int empId, String empName, float basicSal, String... skills) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.basicSal = basicSal;
		this.skillset = new HashSet<>(Arrays.asList(skills));
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", basicSal=" + basicSal + ", skillset=" + skillset
				+ "]";
	}
	
	
	
	
	

}
