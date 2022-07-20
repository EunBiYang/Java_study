
public class Exam1 {
	//매개변수로 전달된 숫자만큼 별문자를 출력하는 함수
	static void star(int n) {
		for(int i=1; i<=n; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		star(1);
		star(2);
	}

}
