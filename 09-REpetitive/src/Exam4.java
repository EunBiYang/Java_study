
public class Exam4 {
	public static void main(String[] args) {
		int sum = 0;
		int x=1;
		
		//while문에서 조건식을 true로 설정했을경우에는
		//반드시 while문 탈출명령문이 있어야한다. 그렇지 않으면 무한루프!
		//=> 원래 조건식은 while문안에 위치를 자유롭게 배치시킬수 있음.
		while(true) {
			//if(x>10) break;
			sum +=x ;
			if(x>=10) break;
			x++;
			//if(x>10) break;
		}
		System.out.println("sum = "+sum);
		System.out.println("------------");
		
		
	}

}
