import java.util.Scanner;

class Sub7{
    Scanner sc = new Scanner(System.in);
    int num1 = 0; // 메뉴 번호 저장
    int position = 0; // 위치값 저장
    boolean[] parking = new boolean[5];
    
	void input_menu() {
        System.out.println("**********");
        System.out.println("1. 입차");
        System.out.println("2. 출차");
        System.out.println("3. 리스트");
        System.out.println("4. 종료");
        System.out.println("**********");
        System.out.print("메뉴: ");
        num1 = sc.nextInt();
	}
	
	void in_car() {
        do {
            System.out.print("위치 입력 [1~5]: ");
            position = sc.nextInt();
         } while(position < 1 || position > 5);
         
         if (parking[position-1]) { // 저장된 값이 true이면, 기존에 차가 있음
            System.out.println(" (" + position + ")위치에 입차 / 이미 주차되어있습니다");
         } else { // 저장된 값이 false이면, 비어 있음
            System.out.println(" (" + position + ")위치에 입차 / 주차되었습니다");
            parking[position-1] = true;
         }
	}
	void out_car() {
		do {
            System.out.print("위치 입력 [1~5]: ");
            position = sc.nextInt();
         } while(position < 1 || position > 5);
         
         if (parking[position-1]) { // 저장된 값이 true이면, 차가 있음
            System.out.println(" (" + position + ")위치에 출차 / 출차되었습니다");
            parking[position-1] = false;
         } else { // 저장된 값이 false이면, 비어 있음
            System.out.println(" (" + position + ")위치에 출차 / 주차되어 있지않습니다");
         }
	}
	void print_list() {
	       for (int i = 0; i < parking.length; i++) {
               System.out.println((i + 1) + "위치 : " + parking[i]);
            }
	}
	void end() {
        System.out.println("종료");
        System.exit(0);
	}
}


public class Practice7 {
   public static void main(String[] args) {
	   Sub7 s7 = new Sub7();
	   
	   while (true) {
		   s7.input_menu();
    	  
		   if (s7.num1 == 1) {
			   s7.in_car();
		   } else if (s7.num1 == 2) {
			   s7.out_car();
		   } else if (s7.num1 == 3) {
			   s7.print_list();
		   } else if (s7.num1 == 4) {
			   s7.end();
		   }
		   System.out.println();  // 1줄 넘김
	   }
   }
}

