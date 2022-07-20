import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//선언
		String name;
		String gender;
		int age;
		double height;
		String result;
		
		//입력
		System.out.print("input name: ");
		name = sc.next();
		System.out.print("input gender: ");
		gender = sc.next();
		System.out.print("input age: ");
		age = sc.nextInt();
		System.out.print("input height: ");
		height = sc.nextDouble();
		
		//연산자
		result = (gender == "F") ? "여성":"남성";
		
		//출력
		System.out.printf("이름 : %s\n",name);
		System.out.printf("성별 : %s\n",result);
		System.out.printf("나이 : %s세\n",age);
		System.out.printf("신장 : %s\n",height);
		
		}

}
