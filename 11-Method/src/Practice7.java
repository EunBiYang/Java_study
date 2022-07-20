import java.util.Scanner;

public class Practice7 {
	
	static int square(int a) {
		return a*a;
	}
	static double square(double a) {
		return a*a;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s1;
		double s2;
		
		System.out.print("정수 입력 : ");
		s1 = sc.nextInt();
		System.out.print("실수 입력 : ");
		s2 = sc.nextDouble();
		
		System.out.println("정수 제곱 : " + square(s1));
		System.out.println("실수 제곱 : " + square(s2));
		sc.close();
	}
	
}
