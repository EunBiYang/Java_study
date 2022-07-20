
public class Exam1 {
	public static void main(String[] args) {
		
		int[] hong;
		hong = new int[3];
		hong[0] = 75;
		hong[1] = 82;
		hong[2] = 95;
		
		int[] kim = new int[3];
		kim[0] = 88;
		kim[1] = 64;
		kim[2] = 70;
		
		//배열을 만든후 특정값으로 초기화
		//int[] lee = new int[] {100,95,90}; 
		int[] lee = {100,95,90}; 
		
		//배열의 총합 구하기
		int sum1=0, sum2=0, sum3=0;
		//1)모든 값을 개별정으로 사용 
		sum1 = hong[0]+hong[1]+hong[2];
		
		//2) for문을 사용
		for(int i=0 ; i<3; i++) {
			sum2 += kim[i];
		}
		for(int i=0 ;i<lee.length; i++) {
			sum3 += lee[i];
		}
		//총점과 평균 출력하기
		System.out.println("홍길동 : "+sum1/hong.length);
		System.out.println("김철수 : "+sum2/kim.length);
		System.out.println("이영희 : "+sum3/lee.length);
	}
}
