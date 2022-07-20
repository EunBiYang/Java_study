import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//변수
		int m = 0;
		int d = 0;
		int t = 0;
		int [] year = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		//입력
		System.out.print("월 : ");
		m = sc.nextInt();
		System.out.print("일 : ");
		d = sc.nextInt();
		
		//명령
		for(int i=0; i<m-1;i++) {
				t += year[i];
		}
		t += d;
		
		//출력
		System.out.printf("1월1일부터 %s월%s일까지는 %s일 입니다.",m,d,t);
	}

}
