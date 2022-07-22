package prac2;

public class CircleArea extends Circle {

	CircleArea(int r) {
		super(r);
	}
	
	@Override
	void compute() {
		size = getR()*getR()*PI;
	}
	@Override
	void output() {
		System.out.println("원의넓이 : "+getSize());
		super.output();
	}

}
