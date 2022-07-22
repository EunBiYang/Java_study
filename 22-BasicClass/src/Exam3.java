
public class Exam3 {
	static int random(int min, int max) {
		int num = (int)(Math.random()*(max - min + 1 )+min);
		return num;
	}
	public static void main(String[] args) {
		
		
		// 0 <= 실수 <1
		System.out.println(Math.random());
		// 1~10 사이의 임의의 정수 1개 생성
		System.out.println(Exam3.random(1, 10));
		//11~20 사이의 임의의 정수 1개 생성
		System.out.println(Exam3.random(11, 20));
		
		
	}

}
