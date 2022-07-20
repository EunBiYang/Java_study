import java.util.Scanner;

public class Practice2 {
	
	static char grade (double a) {
		switch ((int)(a/10)) {
			case 10:return 'A';
			case 9:return 'B';
			case 8:return 'C';
			case 7:return 'D';
			case 6:return 'E';
			default : return 'F';
			}
	}

	static int input(String subject) {
		Scanner sc = new Scanner(System.in);
		System.out.print(subject+"점수 입력 : ");
		return sc.nextInt();
	}

	static int input_eng() {
		Scanner sc = new Scanner(System.in);
		System.out.print("영어 점수 입력 : ");
		return sc.nextInt();
	}

	static int calc_tot(int kor, int eng) {
		return kor + eng;
	}
	
	static double calc_avg(int tot) {
		return (double)tot /2;
	}
	
	static void output(double avg) {
		System.out.println(grade(avg)+"학점입니다.");
	}
	

	
public static void main(String[] args) {
		//선언
		int kor, eng, tot;
		double avg;
		//입력
		//eng = input_eng();
		kor = input("국어");
		eng = input("영어");
		
		//연산
		tot = calc_tot(kor,eng);
		avg = calc_avg(tot);
		
		//출력
		output(avg);
	}
}




