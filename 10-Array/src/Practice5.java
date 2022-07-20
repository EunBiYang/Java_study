import java.util.Scanner;

public class Practice5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//입력
		boolean[] parking = new boolean[5];
		int num =0;
			
		//명령
		while(true) {
			
			System.out.println("\n주차관리 프로그램");
			System.out.println("*************");
			System.out.println("1.입차\n2.출차\n3.리스트\n4.종료\n*************");
			int menu = sc.nextInt();
			
			//조건문
			switch (menu) {
				case 1 :
					do {
						System.out.print("위치 입력 : ");
						num = sc.nextInt();
					}while(num <1 || num >5);
					
					if(parking[num-1]) {
						System.out.println(num+" 위치에 입차 / 이미 주차되었습니다.");
					}else {
						System.out.println(num+" 위치에 입차/ 주차되었습니다.");
						parking[num-1] = true;
					}
					break;
				case 2 : 
					do {
						System.out.print("위치 입력 : ");
						num = sc.nextInt();
					}while(num >1 || num < 5);
					
					if(parking[num-1]) {
						System.out.println(num-1+" 출차 \n 출차되었습니다.");
						parking[num-1] = false;
					}else {
						System.out.println(num-1+" 출차\n 주차되어 있지 않습니다.");
					}
					break;
				case 3 : 
					for (int i=0; i<parking.length; i++) {
						System.out.println(i+1+"위치 : "+parking[i]);
					}
					break;
				default : 
					System.out.println("잘못된 번호입니다.");
				}
			
			if(menu == 4) {
				System.out.print("종료되었습니다.");
				break;
				}

		}

	}

}
