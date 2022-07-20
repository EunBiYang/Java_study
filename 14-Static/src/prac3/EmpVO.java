package prac3;
//JavaBeans
public class EmpVO {
	private String name;
	private int salary;
	private String department;
	
	public EmpVO() {
	}
	public EmpVO(String name,int salary,String department) {
		this.name = name;
		this.salary = salary;
		this.department = department;		
	}
	@Override
	public String toString() {
		String sal_str = String.format("%,.0f", (double)salary);
		return "EmpVO [name=" + name + ", salary=" + sal_str + ", department=" + department + "]";
	}
//getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	

	
	

	
}
