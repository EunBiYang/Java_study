import java.util.Scanner;

class Triangel {
	int base, height;
	Scanner sc = new Scanner(System.in);
	void setTriangle(int b, int h) {
		base = b;
		height = h;
	}
	int getArea() {
		return base*height/2;
	}
}
public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b,h;
		
		System.out.println("*** 삼각형 넓이 구하기 ***");
			System.out.println("밑변 : ");
			b = sc.nextInt();
			System.out.println("높이 : ");
			h = sc.nextInt();
			
		Triangel t = new Triangel();
		t.setTriangle(b,h);
		
		System.out.println("삼각형의 넓이 : "+ t.getArea());
		
		
		

	}

}
