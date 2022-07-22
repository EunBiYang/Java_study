import java.util.Calendar;

public class Exam3 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		long ms1 = calendar.getTimeInMillis();
		System.out.println("파일 복사 시작>>" + ms1);

		
		//예외처리
		try {
			//프로그램 일시 중지, 5000ms(5초동안 프로그램 일시중지)
			Thread.sleep(5000); 
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		calendar = Calendar.getInstance();
		long ms2 = calendar.getTimeInMillis();
		System.out.println("파일 복사 시작>>"+ms2);
		//두 변수의 시간차이 계산
		long result = ms2 -ms1;
		System.out.println(result);
		
		
		System.out.println((double)result/1000+"초 지났음");

	}

}
