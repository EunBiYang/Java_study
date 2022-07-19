// 변수만들고 데이터 저장하기
public class Exam1 {
	public static void main(String[] args) {
		//정수
		int num1;  //4바이트 공간 생성(-20억 ~ 20억)
		num1 = 5;
		System.out.println("num1 = "+num1);
		System.out.println("---------------------");
		
		int num2 = 7;
		System.out.println("num2 = "+num2);
		System.out.println("---------------------");

		//4바이트가 넘을땐 뒤에 접미사 'L'을 붙혀 8바이트 정수로 변환
		long num3 = 1234567890123456789L;  //8바이트 공간 생성(-800경~800경)
		System.out.println("num3 = "+num3);
		System.out.println("---------------------");
		
		byte num4 = 5;  // 1바이트 공간 생성(-128~127 사이)
		System.out.println("num4 = "+num4);
		System.out.println("---------------------");
		
		short num5 = 7;  // 2바이트 공간 생성 (-30만~30만)
		System.out.println("num5 = "+num5);
		System.out.println("---------------------");
		
		
		//실수
		double num6 = 5.5; //8바이트
		System.out.println("num6 = "+num6);
		System.out.println("---------------------");
		
		float num7 = 5.5f; //4바이트, 접미사 'f'를 붙혀 실수로 처리,안붙히면 8바이트로 인식>오류
		System.out.println("num7 = "+num7);
		System.out.println("---------------------");
		
		//문자
		char ch1 = 'A';
		System.out.println("ch1 = "+ch1);
		System.out.println("---------------------");
		
		char ch2 = '홍';
		System.out.println("ch2 = "+ch2);
		System.out.println("---------------------");
		
		ch2 = '김';
		System.out.println("ch2 = "+ch2);
		System.out.println("---------------------");
		
		//boolean
		boolean b1 = true;  //1바이트
		System.out.println("b1 = "+b1);
		System.out.println("---------------------");
		
		boolean b2 = false;  //1바이트
		System.out.println("b2 = "+b2);
		System.out.println("---------------------");
	}

}



























