class Member{
	String name;		//전역변수
	int age;
	
	String getName() {
		return name;
	}
	void setName(String name) {//매개변수는 지역변수 함수안에서만 존재
		this.name = name;//this는 전역변수에 지역변수를 입력하라는 코드
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	void say() {
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(name);
		System.out.println(age);
	}
}
public class Exam5 {
	public static void main(String[] args) {
		Member member = new Member();
		member.setName("홍길동");
		member.setAge(25);
		member.say();
	}

}
