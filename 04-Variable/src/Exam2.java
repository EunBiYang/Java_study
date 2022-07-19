
public class Exam2 {
	public static void main(String[] args) {
		//일반 변수
		int width = 100;
		
		//final : 변수값 변경 금지 명령어 == 상수형 변수
		//==>1번만 데이터값을 저장할 수 있고, 2번째부터는 에러가 남
		final double PI = 3.14;  //상수형 임을 강조하기위해 대문자로 이름을 주는것을 권장!!
		System.out.println("width = "+ width);
		System.out.println("PI = "+ PI);
		System.out.println("-----------------------");
		
		
		width = 200;
		//PI = 3; 상수형이기 때문에 에러가 난다.
		System.out.println("width = "+ width);
		System.out.println("PI = "+ PI);
		System.out.println("-----------------------");
		
	}

}
