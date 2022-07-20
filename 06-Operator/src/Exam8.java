import java.util.Scanner;

//삼항연산자(= 조건연산자)
//(조건식) ? 값1(true) : 값2(false)
public class Exam8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//선언 : 데이터를 저장할 변수 만들기
		int num1=0, num2=0;  //보통 변수만들때 초기값을 설정한다 
		int result=0;
		
		//입력 : 변수에 데이터 저장하기
		System.out.print("정수 입력 : ");
		num1 = sc.nextInt();
		System.out.print("정수 입력 : ");
		num2 = sc.nextInt();
		
		//연산 : 변수에 저장된 데이터 가공하기
		result = (num1 > num2) ? num1 : num2;
		//연산결과가 참이면 첫번째 값을, 거짓이면 두번째 값을 가진다.
		
		//출력 : 변수에 저장된 값 또는 결과값 확인하기
		System.out.println("큰 수 : "+result);
	}

}
