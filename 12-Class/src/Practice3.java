
import java.util.Scanner;
class Sub3{
	//선언
	Scanner scanner = new Scanner(System.in);
	int cnt, num ;
	//입력
	void input() {
		System.out.print("1~100 사이의 배수를 구할 숫자 입력: ");
		num = scanner.nextInt();
	}
	//연산
	void calc(){
		for (int i = 1; i<=100; i++) { 
			if(i%num == 0) {
				cnt++;    
				System.out.print(i + " ");
			}                
		}
	}
	//출력
	void output() {
		System.out.println();
		System.out.printf("1~100 사이의 %d의 배수 = %d\n", num, cnt);
	}
}


public class Practice3 {
	public static void main(String[] args) { 
		//선언
		Sub3 sub3 = new Sub3();
		//입력
		sub3.input();
		//연산
		sub3.calc();
		//출력
		sub3.output();

	}
}
