//api 클래스 위치를 알려주는 것
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor;
		
		System.out.print("이름? ");
		name = sc.next();
		
		System.out.print("국어? ");
		kor = sc.nextInt();
		
		System.out.println(name + " : "+ kor);
		
		//실수
		double num1;
		System.out.print("실수 : ");
		num1 = sc.nextDouble();
		
		System.out.println("num1 : "+num1);
		System.out.println("-----------------------");
		
		//문자
		char ch1;
		System.out.print("문자 : ");
		ch1 = sc.next().charAt(0);
		
		System.out.println("ch1 : "+ch1);
		System.out.println("-----------------------");
		
		//boolean
		boolean b1;
		System.out.print("bool : ");
		b1 = sc.nextBoolean();
		
		System.out.println("b1 : "+b1);
		System.out.println("-----------------------");
		
		
	
		
	}

}
