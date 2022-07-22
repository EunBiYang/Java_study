package parc1;

public class CircleRound extends Circle {

	CircleRound(int r) {
		super(r);
	}

	@Override
	public void compute() {
		setSize(getR()*2*PI);		
	}

	@Override
	public void output() {
		System.out.println("원의둘레 : "+getSize());
		
	}
	
}
	

