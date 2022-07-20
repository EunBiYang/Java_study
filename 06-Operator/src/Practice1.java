import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int sal;
		double tax;
		double msal;
		
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("기본급 입력 : ");
		sal = sc.nextInt();
		System.out.println("---L의 월급---");
		
		tax = sal * 0.033;
		msal = sal - tax;
		
		System.out.printf("기본급 :%,d 원\n",sal);
		System.out.printf("세금 : %,.0f 원\n",tax);
		System.out.printf("월급 : %,.0f 원" ,+ msal);
	}	
}


