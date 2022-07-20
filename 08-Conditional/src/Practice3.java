import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		System.out.print("첫 번째 수 = ");
		num1 = sc.nextInt();
		System.out.print("두 번째 수 = ");
		num2 = sc.nextInt();
		
		if (num1<num2) {
			System.out.printf("첫 번째 수(%d)가 두번째 수(%d)보다 작은수 입니다.",num1,num2);
		}else if(num1 >num2) {
			System.out.printf("첫 번째 수(%d)가 두번째 수(%d)보다 큰 수 입니다.",num1,num2);
		}else if(num1 == num2) {
			System.out.printf("첫 번째 수(%d)와 두번째 수(%d)는 같은 수 입니다.",num1,num2);
		}
	}

}
