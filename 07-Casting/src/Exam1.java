
public class Exam1 {
	public static void main(String[] args) {
		//작은 데이터를 큰 변수에 저장
		short s =100;
		int i = s;
		long l = i;
		float f= 1;
		double d = f;
		
		System.out.println("s = "+s);
		System.out.println("i = "+i);
		System.out.println("l = "+l);
		System.out.println("f = "+f);
		System.out.println("d = "+d);
		System.out.println("-------");
		
		
		char ch = '가';//아스키코드?
		int num = ch;
		System.out.println("ch = "+ch);
		System.out.println("num = "+num);
	}

}
