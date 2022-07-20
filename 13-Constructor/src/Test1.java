import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		Random random = new Random();
		//(random.nextInt(5)) = 0~4사이의 임의 정수 생성
		System.out.println(random.nextInt(5));
		
		//(0~44) +1 => 1부터 5까지 숫자
		System.out.println(random.nextInt(5)+1);
	}
}
