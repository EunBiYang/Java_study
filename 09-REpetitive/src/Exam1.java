
public class Exam1 {
	public static void main(String[] args) {
		int b=0;
		
		for(int i=1; i<=100; i++) {
			if(i%5 ==0) b += i;
		}
		
		System.out.println("b = "+b);
	}

}
