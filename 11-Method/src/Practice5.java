import java.util.Scanner;

public class Practice5 {
	static int input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~100 사이의 배수를 구할 숫자 입력 : ");
        int num = sc.nextInt();
        return num;
	}
	
	static int multiple(int num) {
		int cnt = 0;
		 for (int i = 1; i<=100; i++) { 
	           if(i%num == 0) {
	              cnt++;    
	              System.out.print(i + " ");
	           }                
	        }return cnt;
	}
	
	static void output2(int num, int cnt) {
		System.out.println();
	    System.out.printf("\n1~100 사이의 %d의 배수 = %d", num, cnt);
	}
	
public static void main(String[] args) { 	        
	 int num = input();
	 int cnt = multiple(num);
	 output2(num,cnt);        
	    }

}
