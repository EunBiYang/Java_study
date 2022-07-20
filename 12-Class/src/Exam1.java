class Student{
	String name = "홍길동";
	int age = 25;
}
public class Exam1 {
	public static void main(String[] args) {
		Student ss;
		ss = new Student();
		
		
		System.out.println("이름 : "+ss.name);
		System.out.println("나이 : "+ss.age);
		
	}

}
