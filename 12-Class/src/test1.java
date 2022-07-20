import java.util.Scanner;


class AAA{
	static Scanner sc = new Scanner(System.in);

	//선언
	int a,b,c;		//멤버변수 = 필드

	//입력
	void input() {		//맴버함수 = 메소드
		System.out.print("정수입력 : ");
		a = sc.nextInt();
		System.out.print("정수입력 : ");
		b = sc.nextInt();
	}
	//연산
	void plus() {
	c = a+b;
	}
	//출력
	void output() {
	System.out.println(a+ " + " + b +" = "+c);
	}
}


public class test1 {	
	public static void main(String[] args) {
		AAA aa = new AAA();			//AAA는 유저 자료형
		
		aa.input();			// . =참조 연산자/ 클래스 내의 특정 맴버 참조하는 연산자
		aa.plus();
		aa.output();
		
		
	}

}
