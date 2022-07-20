
public class Exam6 {
	public static void main(String[] args) {
		// 1~10 사이의 홀수의 합 구하기
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			if(i%2 ==0) continue;
			sum += i;
			
			//사실 더 간단하게 하려면 증감식에 i+=2하면 된다.
		}
		
	
		System.out.println("sum = "+sum);
	}

}
