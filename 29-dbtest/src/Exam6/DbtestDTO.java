package Exam6;
//Java Beans class

//DTO : Data Transfer Object

public class DbtestDTO {
	// sql table과 구조를 똑같이 만들어 준다(그대로 복사해서 가겨온 후 틀에 맞게 자료형만 수정)
	private String name; // 이름
	private int age; // 나이
	private double height; // 키 (소수점 2자리)
	private String logtime; // 로그인 시간

	public DbtestDTO() {
	}

	public DbtestDTO(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}

	@Override
	public String toString() {
		String str = String.format("%s\t%s\t%s\t%s", name, age, height, logtime);
		return str;
	}

	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getLogtime() {
		return logtime;
	}

	public void setLogtime(String logtime) {
		this.logtime = logtime;
	}

}
