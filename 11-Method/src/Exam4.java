
public class Exam4 {
	//전달된 매개변수 사이의 합 구하기
	static int sum(int from, int to) {
		int tot = 0;
		for(int i=from; i<=to; i++) {
			tot += i;
		}
		return tot;
	}
	
	
	public static void main(String[] args) {
		System.out.println(sum(1,10));
		System.out.println(sum(4,400));
	}

}
