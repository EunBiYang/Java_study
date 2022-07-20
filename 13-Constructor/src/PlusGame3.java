import java.util.Random;
import java.util.Scanner;

public class PlusGame3 {
	Random random = new Random();
	Scanner sc = new Scanner(System.in);
	
	private int[] quiz; 	//퀴즈 갯수
	private int answer; 	//정답
	private int num1,num2;	//숫자1,2
	private int o;		//채점
	private String cont;	//계속할지 묻기
	private int cnt;		//기회
	
	public PlusGame3() {
		quiz = new int[5];
	}

	public void outputQuiz() {
		while(true) {
			for(int i=0; i<quiz.length;i++) {
				num1 = random.nextInt(90)+10;
				num2 = random.nextInt(90)+10;
				System.out.printf("[%s] %s + %s =  ",i+1,num1,num2);
				answer = sc.nextInt();
				
				if(answer == num1+num2) {
					System.out.println("정답입니다.");
					o++;
				}else {
					System.out.println("틀렸다.. 정답 : "+(num1+num2));
					cnt++;
					if(cnt == 2) {
						break;
					}
				}
			}
			System.out.println("당신은 총 "+o+" 문제를 맞춰서 "+o*20+"점 입니다.");
			
			System.out.print("continue(y/n) : ");
			cont = sc.next();
			if(cont.equals("y")) {
				continue;
			}else{
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println();
	}
}
