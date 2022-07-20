import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] jumsu = new int[5];
		int sum=0;
		
		for (int i=0; i<jumsu.length; i++) {
			System.out.print(i+1+"번 학생의 점수를 입력: ");
			jumsu[i] = sc.nextInt();
			sum += jumsu[i];
		}
		
		/*
		System.out.print("1번 학생의 점수를 입력 : ");
		jumsu[0]= sc.nextInt();
		System.out.print("2번 학생의 점수를 입력 : ");
		jumsu[1]= sc.nextInt();
		System.out.print("3번 학생의 점수를 입력 : ");
		jumsu[2]= sc.nextInt();
		System.out.print("4번 학생의 점수를 입력 : ");
		jumsu[3]= sc.nextInt();
		System.out.print("5번 학생의 점수를 입력 : ");
		jumsu[4]= sc.nextInt();
		
		for(int i=0 ;i<jumsu.length; i++) {
			sum += jumsu[i];
		}
		*/
				
		System.out.printf("총점 : %d, 평균 : %.1f ",sum,(double)sum/jumsu.length);
		
	}
}
