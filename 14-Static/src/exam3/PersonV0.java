package exam3;
//JavaBeans 클래스
//=>여래개 변수를 묶어서 관리하는 클래스
public class PersonV0 {
	private String name;
	private int age;
	private String tel;
	
	public PersonV0() {
	}

	public PersonV0(String name,int age,String tel) {
		this.name = name;
		this.age = age;
		this.tel = tel;
	}
	
	//모든 멤버변수 내용 확인하는 함수
	@Override
	public String toString() {
		return "PersonV0 [name=" + name + ", age=" + age + ", tel=" + tel + "]";
	}

	//getter, setter
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
