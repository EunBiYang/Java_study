import java.util.Scanner;

public class test2 {
	
	static int input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int a= sc.nextInt();
		return a;
	}
	
	static int plus(int a, int b) {
		return a + b;
	}
	
	static void output(int a, int b, int c) {
		System.out.printf("%d + %d = %d",a,b,c);
	}
	
	
	public static void main(String[] args) {
				
		//선언:변수 만들기
		int a, b, c;
		
		//입력:변수에 데이터 저장하기
		a = input();
		b = input();
		
		//연산:저장된 데이터 가공하기
		c= plus(a,b);
		
		//출력: 데이터 및 결과값 확인하기
		output(a,b,c);
		
	}

}
