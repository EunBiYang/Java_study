
class Triangle{
	private int h;
	private int w;
	
	//디폴트 생성자 생성
	Triangle(){
	}
	
	public Triangle(int w, int h) {//객체 생성 직후, 변수값 설정
		this.w = w;
		this.h = h;
	}
	//set함수, setter가 아니다.
	public void setTriangle(int w, int h) {//객체생성 이후, 변수값 설정
		this.w = w;
		this.h = h;		
	}
	//get함수, getter가 아니다.
	public double getArea() {
		return (w*h)/2;
	}
	
//setter 와 getter
	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}
	
}

public class Practice1 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.setTriangle(5, 12);
		System.out.println("삼각형의 넓이 : " + t1.getArea());
		
		Triangle t2 = new Triangle(45, 7);
		t2.setTriangle(47, 7);
		System.out.println("삼각형의 넓이 :" + t2.getArea());
	}

}
