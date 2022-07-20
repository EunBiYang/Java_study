
public class Exam3 {
	public static void main(String[] args) {
		int sum = 0;
		//for 문 사용
		for(int i=1; i<=10; i++) {
			sum +=i;
		}
		
		System.out.println("sum = "+sum);
		System.out.println("------------");
		
		
		//while문 사용
		sum = 0;
		int x=1;
		
		while(x<=10) {
			sum +=x ;
			x++;
		}
		System.out.println("sum = "+sum);
		System.out.println("------------");
		
		
		
	}

}
