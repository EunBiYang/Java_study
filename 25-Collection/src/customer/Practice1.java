package customer;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		//필요한 클래스 호출
		Scanner sc = new Scanner(System.in);
		CustomerImpl c = new CustomerImpl();
		int num;
		
		while(true) {
			do {
				System.out.println("1.입력");
				System.out.println("2.출력");
				System.out.println("3.고객번호검색");
				System.out.println("4.이름검색");
				System.out.println("5.전화번호검색");
				System.out.println("6.이름 내림차순 정렬");
				System.out.println("7.고객번호 오름차순 정렬");
				System.out.println("8.종료");
				System.out.println("-----------------------------");
				System.out.print("번호 : ");
				num = sc.nextInt();
			}while(num<1 || num>8);
			
			System.out.println();
			switch (num) {
			case 1 : c.input();break;//입력
			case 2 : c.print();break;//출력
			case 3 : c.searchCnum();break;//고객번호검색
			case 4 : c.searchCname();break;//이름검색
			case 5 : c.searchCtel();break;//전화번호검색
			case 6 : c.descSortCname();break;//이름 내림차순 정렬
			case 7 : c.ascSortCtel();break;//고객번호 오름차순 정렬
			case 8 : System.out.println("종료합니다.");
					System.exit(0);
			}
			System.out.println();
		}
	}
	
}
 