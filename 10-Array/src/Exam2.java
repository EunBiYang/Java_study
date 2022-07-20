
public class Exam2 {
	public static void main(String[] args) {
		//학급 성적을 위한 배열
		int[][] jumsu = new int[3][3];
		String[] name = {"홍길동","김철수","이영희"};
		
		//홍길동의 과목점수
		jumsu[0][0] = 75;
		jumsu[0][1] = 82;
		jumsu[0][2] = 95;
		
		//김철수의 과목점수;
		jumsu[1][0] = 88;
		jumsu[1][1] = 64;
		jumsu[1][2] = 70;
		
		//이영희의 과목점수
		jumsu[2][0] = 100;
		jumsu[2][1] = 95;
		jumsu[2][2] = 90;
		
		
		//총점, 평균 계산 및 출력
		for(int i=0 ; i<jumsu.length; i++) {   //행
			int sum = 0;
			int avg = 0;
			
			for(int j=0; j<jumsu[i].length;j++) {  //열
				sum += jumsu[i][j];
			}
			avg = sum/jumsu[i].length;
			
			System.out.println(name[i]+",총점 ="+sum+", 평균 : "+avg);
		}
	}

}
