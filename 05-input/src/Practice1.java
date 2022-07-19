import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//정수
		int num1;
		System.out.print("정수 :");
		num1 = sc.nextInt();

		//실수
		double num2;
		System.out.print("실수 : ");
		num2 = sc.nextDouble();

		//문자
		char ch1;
		System.out.print("문자 : ");
		ch1 = sc.next().charAt(0);

		//boolean
		boolean b1;
		System.out.print("bool : ");
		b1 = sc.nextBoolean();
		
		//string
		String name;
		System.out.print("이름? ");
		name = sc.next();
		
		/*
		System.out.println("----결과확인----");
		System.out.println("정수: "+num1);
		System.out.println("실수 : "+num2);
		System.out.println("문자 : "+ch1);
		System.out.println("boolean : "+b1);
		System.out.println("문자열 : "+b1);
		*/
		System.out.println("----결과확인----");
		System.out.printf("정수: %s\n",num1);
		System.out.printf("실수 :  %s\n",num2);
		System.out.printf("문자 :  %s\n",ch1);
		System.out.printf("boolean :  %s\n",b1);
		System.out.printf("문자열 : %s\n",name);
	}

}

