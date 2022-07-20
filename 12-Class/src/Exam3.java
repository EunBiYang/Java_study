class HelloWorld{
	String message;
	
	void setEng() {
		message = "Hello java";
	}
	void setKor() {
		message = "안녕하세요 자바";
	}
	void sayHello() {
		System.out.println(message);
	}
	
}
public class Exam3 {
	public static void main(String[] args) {
		HelloWorld world = new HelloWorld();	//객체 생성
		
		world.setEng();
		world.sayHello();
		
		world.setKor();
		world.sayHello();
	}

}
