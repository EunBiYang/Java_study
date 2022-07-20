package prac4;

import java.util.Scanner;

public class Practice4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomerImpl c = new CustomerImpl();
		int num;
		
		while(true) {
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("3. 수정");
			System.out.println("4. 이름검색");
			System.out.println("5. 종료");
			System.out.println("----------------");
			System.out.print("번호 입력 : ");
			num = sc.nextInt();
			
			switch(num) {
			case 1 :
				c.input();
				break;
			case 2 : 
				c.output();
				break;
			case 3:
				c.change();
				break;				
			case 4:
				c.search();
				break;
			case 5 : 
				System.out.println("프로그램 종료");
				System.exit(0);
		}
		System.out.println();
	}
	}
}
