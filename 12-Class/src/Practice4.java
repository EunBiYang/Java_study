import java.util.Scanner;

class Sub4{
	//선언
    Scanner sc = new Scanner(System.in);
    int num = 0;
    String a;
    //입력
	void input_dan() {
        System.out.print("몇 단을 출력할지 입력하세요 : ");
        num = sc.nextInt();
	}
	//연산,출력
	void print_gugudan() {
        for (int y = 1; y <= 9; y++) {
            System.out.printf("%d*%d=%s\n", num, y, num * y);
         }
	}
	//입력
	void input_continue() {
        System.out.print("계속할지 선택하세요(y계속):");
        a = sc.next();
	}
	//연산
	void isEnd() {
        if (!a.equals("y")) {
            System.out.print("종료");
            System.exit(0);
        }
	}
}

public class Practice4 {
   public static void main(String[] args) {
	  Sub4 s4 = new Sub4();

      while (true) {
    	  s4.input_dan();
    	  s4.print_gugudan();
    	  s4.input_continue();
    	  s4.isEnd();
         System.out.println(); // 1줄넘김
      }
   }
}  
