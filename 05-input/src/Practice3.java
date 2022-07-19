import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int num1,num2,num3;
		
		System.out.print("이름? : ");
		name = sc.next();
		System.out.print("국어? : ");
		num1 = sc.nextInt();
		System.out.print("영어? : ");
		num2 = sc.nextInt();
		System.out.print("수학? : ");
		num3 = sc.nextInt();
		

		System.out.println("이름 : "+name);
		System.out.printf("총점 :%d ",num1+num2+num3);
		
	}

}
