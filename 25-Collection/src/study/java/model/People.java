package study.java.model;
//java beans 클래스 : 변수를 묶어서 관리하는 클래스
public class People {
	private String name, phone;
	
	public People() {
	}

	public People(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", phone=" + phone + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
