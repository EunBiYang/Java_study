
class Student{
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}

public class Exam3 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("홍길동");
		s1.setAge(25);
		
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
	}

}
