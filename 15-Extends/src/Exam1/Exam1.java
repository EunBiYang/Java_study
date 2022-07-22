package Exam1;

public class Exam1 {
	public static void main(String[] args) {
		//부모 클래스 사용 
		CalcParent parent = new CalcParent();
		System.out.println(parent.plus(100, 200));
		System.out.println(parent.minus(100, 200));
		System.out.println("--------------------");
		
		//자식 클래스 사용
		CalcChild child = new CalcChild();
		System.out.println(child.plus(100, 200));
		System.out.println(child.minus(100, 200));
		System.out.println(child.multiply(100, 200));
		System.out.println(child.divide(200, 100));
				
	}

}
