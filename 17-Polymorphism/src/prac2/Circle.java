package prac2;

public class Circle {
	private int r;
	double size;
	final double PI = 3.141592;
	
	Circle(int r){
		this.r = r;
	}
	
	void compute() {}
	void output() {}
	
	//g/s
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
