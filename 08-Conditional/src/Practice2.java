import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double avg=0,kor=0, eng=0,score=0;
		char grade = 0; // 문자의 초기화는 0
				
		//입력
		System.out.print("국어점수 입력 : ");
		kor = sc.nextInt();
		System.out.print("영어점수 입력 : ");
		eng = sc.nextInt();
		score = kor + eng;
		avg = score/2;
		
		//명령
		switch((int)(avg)/10) {
		case 10 :
		case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default: grade = 'F'; break;
		}
				
		//출력
		System.out.printf("총점 = %.0f\n평균 = %s\n학점 = %s",score,avg,grade);

		sc.close();
	}

}
