
public class Exam3 {
	static double x,y;			//전역변수
	
	static double plus() {		//전역변수를 선언하면 별도의 매개변수를 불러줄 필요가 없다.
		return x + y;
	}
	static double minus() {
		return x - y;
	}
	public static void main(String[] args) {
		x = 100.5;
		y = 200.7;
		double r = plus();
		System.out.println(x+" + "+y+" = "+r);
		
		x = 10.5;
		y = 20.7;
		System.out.println(x+" - "+y+" = "+minus());
	}

	
	
		
	/*
	static double plus(double x, double y) {
		return x + y;
	}
	
	static double minus(double x, double y) {
		return x - y;
	}
	
	
	public static void main(String[] args) {
		double x = 100.5;
		double y = 200.7;
		double r = plus(x,y);
		System.out.println(x+" + "+y+" = "+r);
		
		x = 10.5;
		y = 20.7;
		System.out.println(x+" - "+y+" = "+minus(x,y));
	}
*/
	
}
