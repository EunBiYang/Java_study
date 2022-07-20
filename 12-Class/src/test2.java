import java.util.Scanner;

//더하기 기능의 프로그램을 클래스로 만듦
//user 자료형
class BBB{	
	//선언
	Scanner sc = new Scanner(System.in);
	int a,b,c;	//맴버변수,전역변수,모든 함수가 공통으로 사용하게된다.
	//입력
	void input() {		//맴버함수(매소드)
		System.out.print("정수 입력 : ");
		a = sc.nextInt();
		System.out.print("정수 입력 : ");
		b = sc.nextInt();
	}
	//연산
	void plus() {
		c = a+b;
	}
	//출력
	void output() {
		System.out.printf("%d + %d = %c",a,b,c);
	}
}


public class test2 {
	public static void main(String[] args) {
		//선언
		BBB bb = new BBB();
		//입력
		bb.input(); 
		//bb.a = 5;//전역변수를 메인에서 바꿔줄때에는 클래스명+.변수명으로 할 수도잇다.
		//bb.b = 6;//권장하지는 않음.
		//연산
		bb.plus();
		//출력
		bb.output();
	}

}
