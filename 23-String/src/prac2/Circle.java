package prac2;

public class Circle {
	//singleton 패턴 시작

	private static Circle instance;
	
	public static Circle getInstance() {
		if(instance == null) instance = new Circle();
		return instance;
	}
	
	private Circle() {}
	//singleton 패턴 끝
	
	//메소드 입력
	private int r;
	private double size,round;
	final double PI = 3.141592;

		
	public void compute_area() {
		size=r*r*PI;
	}
	public void output_area() {
		System.out.println("원의넓이 : "+size);	
	}
	
	public void compute_round() {
		round=r*2*PI;		
	}


	public void output_round() {
		System.out.println("원의둘레 : "+round);		
	}

	
	//getter/setter
	public double getRound() {
		return round;
	}

	public void setRound(double round) {
		this.round = round;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}
	

}
