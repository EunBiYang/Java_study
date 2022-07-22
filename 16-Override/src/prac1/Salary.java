package prac1;

public class Salary {
	private String name;
	private int salary;
	
	Salary(String name,int salary) {
		this.name = name;
		this.salary=salary;
	}
	
	void viewInformation() {
		System.out.printf("이름 : %s\n연봉 : %d\n",getName(),getSalary());
	}
	
	//g/s
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

}
