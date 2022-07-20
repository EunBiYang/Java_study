
public class Exam5 {
	public static void main(String[] args) {
		//후위 연산
		int a1 = 100;
		int x1 = 1;
	//   1     3    2    4
		int y1 = a1 + x1++;
		//가독성이 떨어지기 때문에 잘 사용되지 않는다/보통은 두줄로 나눠 쓴다
		//int y1 = a1 + x1;
		//x1++;
		System.out.println("x1 = "+x1);
		System.out.println("y1 = "+y1);
		System.out.println("---------");
		
		//전위 연산
		int a2 = 100;
		int x2 = 1;
	//   1     4    3    2		
		int y2 = a2 + ++x2;
		//++x2;
		//int y2 = a2 + x2;
		System.out.println("x2 = "+ x2);
		System.out.println("y2 = "+ y2);
	}

}
