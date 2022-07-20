import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a=0, b=0, result=0;
		String c="";
		
		//입력
		System.out.print("첫 번째 수 : ");
		a = sc.nextDouble();
		System.out.print("두 번째 수 : ");
		b = sc.nextDouble();
		System.out.print("연산자 : ");
		c = sc.next();
		
		//명령
		switch (c) {
		case "+": result = a + b ;break;
		case "-": result = a - b ;break;
		case "*": result = a * b ;break;
		case "/": result = a / b ;break;
		default: c = "e";
		}
		
		//출력
		if (c.equals("e")) {
			System.out.println("연산자 입력이 잘못되었습니다. 연산자(+, -, *, /)");
		}else {
		System.out.printf("%s %s %s = %s", a,c,b,result);
		}
		sc.close();
	}

}
