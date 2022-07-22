import java.util.Random;
import java.util.Scanner;

public class Exam4 {
	public static void main(String[] args) {
		
		//인증번호 저장
		String authNum = "";
		Random random = new Random();
		
		for(int i=0; i<6; i++) {
			authNum += random.nextInt(10)+" ";		//0~9사이의 정수1개 생성
		}
		System.out.println("인증번호 : "+authNum);
		
		System.out.println("------------------------");
		
		
		
		//self study
		//문자열로 로또 만들어보기
		Scanner sc = new Scanner(System.in);
		System.out.print("구매횟수 : ");
		int num = sc.nextInt();
		String []authNum1 = new String[6];


		for(int k=0; k<authNum1.length;k++) {
			authNum1[k] ="";  //공백문자열은 안만들어주면 null값이 생긴다.
			for(int i=1; i<=6; i++) {				
				authNum1[k] += (random.nextInt(45)+1)+" " ; 
			}
		}
		
		for (int i=1;i<authNum1.length;i++) {
			System.out.println(authNum1[i]);
		}
	}
}
