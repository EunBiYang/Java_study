
public class Exam1 {
	public static void main(String[] args) {
		//Wrapper
		//기본데이터형과 객체화된 데이터는 서로 연산이 가능하다.
		//가운데 줄이 가는 명령어 : deprecated 되어진 명령어, 조만간 없어질 명령어
		Integer integer = new Integer(123);  
		int x= 256;
		int r = integer + x;
		System.out.println(r);
		
		
		Object ob1 = integer;
		Object ob2 = x;
		
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println("----------------");
		
		//문자열 데이터를 기본자료형으로 전환해서 쓸대 많이 사용하다.
		String a= "20";
		String b= "3.14";
		
		int num_a = Integer.parseInt(a);		//int(a)   파이썬에서
		double num_b = Double.parseDouble(b);	//float(b)
		
		System.out.println(a+100);
		System.out.println(num_a+100);
		
		
		System.out.println(b+5.5);
		System.out.println(num_b+5.5);
		
	}

}
