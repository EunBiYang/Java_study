import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//변수
		System.out.print("1~100 사이의 배수를 구할 숫자 입력 : ");
		int num = sc.nextInt();
		int cnt = 0;  //갯수를 저장할 변수
		//명령
		for(int i = 1 ; i <= 100; i++) {
			if (i % num == 0) {
				cnt++;
				System.out.print(i+" ");
			}
		}
		//출력
		System.out.println();
		System.out.printf("1~100 사이의 %d의 배수 = %d", num, cnt);
	}

}

