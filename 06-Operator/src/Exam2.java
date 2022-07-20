
public class Exam2 {
	public static void main(String[] args) {
		// 정수의 나눗셈 =>몫 구하기, '정수/정수=정수'
		int a = 7;
		int b = 3;
		int r1 = a / b;
		System.out.println("7 / 3 = " +r1);
		System.out.println("--------------");
		
		//실수의 나눗셈  '실수/실수=실수'
		double c = 7;
		double d = 3;
		double r2 = c / d;
		System.out.println("7 / 3 = " +r2);
		System.out.println("--------------");
		
		//정수와 실수의 나눗셈  '정수/실수=실수'
		//결과는 실수로 나온다. 실수가 하나라도 있으면 실수로 계산된다.
		double r3 = a / d;
		System.out.println("7 / 3 = " +r3);
		System.out.println("--------------");
		
		//0으로 나누기
		//System.out.println(100/0);  //자바에서는 정수 0으로 나누면 에러가 난다.
		System.out.println(100/0.0);  //실수 0.0으로 나누면 Infinity가 나온다.
		
		
	}

}
