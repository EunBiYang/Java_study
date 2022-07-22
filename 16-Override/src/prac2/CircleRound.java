package prac2;

public class CircleRound extends Circle {

	CircleRound(int r) {
		super(r);
	}
	
	@Override
	void compute() {
		size = getR()*2*PI;
	}
	@Override
	void output() {
		System.out.println("원의둘레 : "+getSize());
		super.output();
	}

}
