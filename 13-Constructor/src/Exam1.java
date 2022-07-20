
class Book{
	String subject;
	String content;
	
	//생상자 함수
	Book(){
		System.out.println("생성자 Book()호출");
		subject = "java 입문";
		content = "java는 여러 방면에 사용됩니다.";
	}
	
	//일반 함수
	void Book() {
		System.out.println("일반함수 void Book() 호출");
	}
	
	void read() {
		System.out.println(subject);
		System.out.println(content);
	}
}


public class Exam1 {
	public static void main(String[] args) {
		Book book = new Book();
		//객체 생성시 딱 한번 생성자 함수 생성 및 호출
		book.read();
		book.Book();//일반함수 Book이 호출된다
	}

}
