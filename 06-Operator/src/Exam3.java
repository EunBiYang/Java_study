
public class Exam3 {
	public static void main(String[] args) {
		//대입 연산자 + 다른 연산자
		int num1 = 100;
		System.out.println("num1 = "+num1);
		System.out.println("--------------");
		
		num1 = num1 + 100;
		System.out.println("num1 = "+num1);
		System.out.println("--------------");
		
		
		//결합 연산자로 짧게 작성
		// +=, -=, *=, /=, %= 예제
		num1 += 100;
		System.out.println("num1 = "+num1);
		System.out.println("--------------");
		
		num1 -= 50;
		System.out.println("num1 = "+num1);
		System.out.println("--------------");
		
		num1 *= 2;
		System.out.println("num1 = "+num1);
		System.out.println("--------------");
		
		num1 /= 100;   //몫
		System.out.println("num1 = "+num1);
		System.out.println("--------------");
		
		num1 %= 2;     //나머지
		System.out.println("num1 = "+num1);
		System.out.println("--------------");
	}

}
